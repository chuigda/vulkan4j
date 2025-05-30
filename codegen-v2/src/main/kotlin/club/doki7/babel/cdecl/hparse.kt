package club.doki7.babel.cdecl

import club.doki7.babel.registry.IMergeable
import club.doki7.babel.registry.Registry
import java.util.TreeSet
import java.util.logging.Logger

enum class ControlFlow {
    ACCEPT, NEXT, RETURN
}

typealias InitContext = (MutableMap<String, Any>) -> Unit
typealias LineMatcher = (MutableMap<String, Any>, List<String>, Int) -> ControlFlow
typealias SingleLineMatcher = (MutableMap<String, Any>, String, Int) -> ControlFlow
typealias LineAction<E> = (Registry<E>, MutableMap<String, Any>, List<String>, Int) -> Int

internal val log = Logger.getLogger("c.d.b.cdecl.hparse")

internal data class LineHandler<E: IMergeable<E>>(
    val priority: Int,
    val matcher: LineMatcher,
    val action: LineAction<E>
) : Comparable<LineHandler<E>> {
    override fun compareTo(other: LineHandler<E>): Int {
        return priority.compareTo(other.priority)
    }
}

class ParseConfig<E: IMergeable<E>> internal constructor(
    internal val initSet: MutableSet<InitContext>,
    internal val handlerSet: TreeSet<LineHandler<E>>
) {
    constructor() : this(mutableSetOf(), TreeSet())

    fun addInit(init: InitContext) {
        initSet.add(init)
    }

    fun addRule(priority: Int, matcher: LineMatcher, action: LineAction<E>) {
        handlerSet.add(LineHandler(priority, matcher, action))
    }

    fun addRule(priority: Int, matcher: SingleLineMatcher, action: LineAction<E>) {
        val matcher: LineMatcher = { cx, lines, index -> matcher(cx, lines[index], index) }
        addRule(priority, matcher, action)
    }

    fun addRule(
        priority: Int,
        matcher: LineMatcher,
        action: (Registry<E>, List<String>, Int) -> Int
    ) {
        addRule(priority, matcher) { r, _, lines, index -> action(r, lines, index) }
    }

    fun addRule(
        priority: Int,
        matcher: SingleLineMatcher,
        action: (Registry<E>, List<String>, Int) -> Int
    ) {
        addRule(priority, matcher) { r, _, lines, index -> action(r, lines, index) }
    }

    fun addRule(
        priority: Int,
        matcher: LineMatcher,
        action: (MutableMap<String, Any>, List<String>, Int) -> Int
    ) {
        addRule(priority, matcher) { _, cx, lines, index -> action(cx, lines, index) }
    }

    fun addRule(
        priority: Int,
        matcher: SingleLineMatcher,
        action: (MutableMap<String, Any>, List<String>, Int) -> Int
    ) {
        addRule(priority, matcher) { _, cx, lines, index -> action(cx, lines, index) }
    }

    fun addRule(
        priority: Int,
        matcher: LineMatcher,
        action: (List<String>, Int) -> Int
    ) {
        addRule(priority, matcher) { _, _, lines, index -> action(lines, index) }
    }

    fun addRule(
        priority: Int,
        matcher: SingleLineMatcher,
        action: (List<String>, Int) -> Int
    ) {
        addRule(priority, matcher) { _, _, lines, index -> action(lines, index) }
    }
}

fun <E: IMergeable<E>> parse(
    config: ParseConfig<E>,
    registry: Registry<E>,
    fileName: String,
    lines: List<String>,
    index: Int
): Int {
    val context = mutableMapOf<String, Any>()
    config.initSet.forEach { it(context) }

    var index = index
    var prevIndex: Int? = null
    while (index < lines.size) {
        if (prevIndex == index) {
            log.warning("$fileName:${index+1}: dead loop detected, forcing progress")
            index++
        }
        prevIndex = index

        for (handler in config.handlerSet) {
            when (handler.matcher(context, lines, index)) {
                ControlFlow.ACCEPT -> {
                    index = handler.action(registry, context, lines, index)
                    prevIndex = index
                    break
                }
                ControlFlow.NEXT -> continue // try next handler
                ControlFlow.RETURN -> return index
            }
        }

        log.warning("$fileName:${index+1}: no handler matched, skipping line")
        index++
    }

    return index
}
