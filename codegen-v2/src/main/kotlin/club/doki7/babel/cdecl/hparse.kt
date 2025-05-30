package club.doki7.babel.cdecl

import club.doki7.babel.registry.IMergeable
import club.doki7.babel.registry.Registry
import java.util.TreeSet
import java.util.logging.Logger

enum class ControlFlow {
    ACCEPT, NEXT, RETURN
}

typealias InitContext = (MutableMap<String, Any>) -> Unit
typealias LineMatcher = (List<String>, Int) -> ControlFlow
typealias SingleLineMatcher = (String) -> ControlFlow
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
        val matcher: LineMatcher = { lines, index -> matcher(lines[index]) }
        addRule(priority, matcher, action)
    }
}

fun <E: IMergeable<E>> parse(
    config: ParseConfig<E>,
    registry: Registry<E>,
    cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int
): Int {
    config.initSet.forEach { it(cx) }

    var index = index
    var prevIndex: Int? = null
    while (index < lines.size) {
        if (prevIndex == index) {
            log.warning("${index+1}: dead loop detected, forcing progress")
            index++
        }
        prevIndex = index

        if (lines[index].isBlank()) {
            index++
            continue
        }

        for (handler in config.handlerSet) {
            when (handler.matcher(lines, index)) {
                ControlFlow.ACCEPT -> {
                    index = handler.action(registry, cx, lines, index)
                    prevIndex = index
                    break
                }
                ControlFlow.NEXT -> continue // try next handler
                ControlFlow.RETURN -> return index
            }
        }

        log.warning("${index+1}: no handler matched, skipping line")
        index++
    }

    return index
}

fun detectTriSlashDoxygen(line: String) =
    if (line.startsWith("///")) {
        ControlFlow.ACCEPT
    } else {
        ControlFlow.NEXT
    }

fun <E: IMergeable<E>> parseAndSaveTriSlashDoxygen(
    @Suppress("unused") registry: Registry<E>,
    cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int
): Int {
    val result = parseBlockDoxygen(lines, index)
    if (result.first != null) {
        cx["doxygen"] = result.first!!
    } else {
        cx.remove("doxygen")
    }
    return result.second
}

fun detectBlockDoxygen(line: String) =
    if (line.startsWith("/*!")
        || line.startsWith("/**")) {
        ControlFlow.ACCEPT
    } else {
        ControlFlow.NEXT
    }

fun <E: IMergeable<E>> parseAndSaveBlockDoxygen(
    @Suppress("unused") registry: Registry<E>,
    cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int
): Int {
    val result = parseBlockDoxygen(lines, index)
    if (result.first != null) {
        cx["doxygen"] = result.first!!
    } else {
        cx.remove("doxygen")
    }
    return result.second
}

fun detectLineComment(line: String) =
    if (line.startsWith("//")) {
        ControlFlow.ACCEPT
    } else {
        ControlFlow.NEXT
    }

fun detectPreprocessor(line: String) =
    if (line.startsWith("#")) {
        ControlFlow.ACCEPT
    } else {
        ControlFlow.NEXT
    }

fun <E: IMergeable<E>> nextLine(
    @Suppress("unused") registry: Registry<E>,
    @Suppress("unused") cx: MutableMap<String, Any>,
    @Suppress("unused") lines: List<String>,
    index: Int
) = index + 1

fun detectBlockComment(line: String) =
    if (line.startsWith("/*")) {
        ControlFlow.ACCEPT
    } else {
        ControlFlow.NEXT
    }

fun <E: IMergeable<E>> skipBlockComment(
    @Suppress("unused") registry: Registry<E>,
    @Suppress("unused") cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int
): Int {
    assert(lines[index].startsWith("/*")) { "Expected block comment start at line $index" }
    var i = index + 1
    while (i < lines.size && !lines[i].contains("*/")) {
        i++
    }
    return index
}

fun <E: IMergeable<E>> dummyAction(
    @Suppress("unused") registry: Registry<E>,
    @Suppress("unused") cx: MutableMap<String, Any>,
    @Suppress("unused") lines: List<String>,
    index: Int
): Int {
    log.warning("dummy operation at line $index called, did you correctly set ControlFlow.RETURN?")
    return index + 1
}
