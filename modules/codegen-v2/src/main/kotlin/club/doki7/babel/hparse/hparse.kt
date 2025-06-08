package club.doki7.babel.hparse

import club.doki7.babel.cdecl.isIdentChar
import club.doki7.babel.cdecl.parseBlockDoxygen
import club.doki7.babel.cdecl.parseTriSlashDoxygen
import club.doki7.babel.registry.IMergeable
import club.doki7.babel.registry.Registry
import java.util.logging.Logger

enum class ControlFlow {
    ACCEPT, NEXT, RETURN
}

typealias InitContext = (MutableMap<String, Any>) -> Unit
typealias LineMatcher = (List<String>, Int) -> ControlFlow
typealias SingleLineMatcher = (String) -> ControlFlow
typealias LineAction<E> = (Registry<E>, MutableMap<String, Any>, List<String>, Int) -> Int

internal val log = Logger.getLogger("c.d.b.hparse")

internal class LineHandler<E: IMergeable<E>>(
    val priority: Int,
    val matcher: LineMatcher,
    val action: LineAction<E>
)

class ParseConfig<E: IMergeable<E>> internal constructor(
    internal val initSet: MutableSet<InitContext>,
    internal val handlerSet: MutableSet<LineHandler<E>>
) {
    constructor() : this(mutableSetOf(), mutableSetOf())

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

fun <E: IMergeable<E>> hparse(
    config: ParseConfig<E>,
    registry: Registry<E>,
    cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int
): Int {
    config.initSet.forEach { it(cx) }

    var index = index
    var prevIndex: Int? = null
    outer@ while (index < lines.size) {
        if (prevIndex == index) {
            log.warning("${index+1}: dead loop detected, forcing progress: ${lines[index]}")
            index++
        }
        prevIndex = index

        if (lines[index].isBlank()) {
            index++
            continue
        }

        for (handler in config.handlerSet.sortedBy { it.priority }) {
            when (handler.matcher(lines, index)) {
                ControlFlow.ACCEPT -> {
                    index = handler.action(registry, cx, lines, index)
                    continue@outer
                }
                ControlFlow.NEXT -> continue
                ControlFlow.RETURN -> return index
            }
        }

        log.warning("${index+1}: unknown line: ${lines[index]}")
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
    val result = parseTriSlashDoxygen(lines, index)
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

fun detectFunctionAlikeMacro(line: String): ControlFlow {
    if (!line.startsWith("#define")) {
        return ControlFlow.NEXT
    }

    val trimmed = line.removePrefix("#define").trimStart()
    var index = 0
    while (index < trimmed.length && trimmed[index].isIdentChar()) {
        index++
    }

    return if (index < trimmed.length && trimmed[index] == '(') {
        ControlFlow.ACCEPT
    } else {
        ControlFlow.NEXT
    }
}

fun <E: IMergeable<E>> skipPreprocessor(
    @Suppress("unused") registry: Registry<E>,
    @Suppress("unused") cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int
): Int {
    assert(lines[index].startsWith("#")) { "Expected preprocessor directive at line $index" }
    if (!lines[index].endsWith("\\")) {
        return index + 1
    }

    var index1 = index
    while (index1 < lines.size && lines[index1].endsWith("\\")) {
        index1++
    }
    return index1 + 1
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
    var i = index
    while (i < lines.size && !lines[i].contains("*/")) {
        i++
    }
    if (i >= lines.size) {
        log.warning("Unterminated block comment starting at line $index")
    }
    return i + 1
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

fun detectIfdefCplusplus(line: String) =
    if (line.startsWith("#ifdef __cplusplus")) {
        ControlFlow.ACCEPT
    } else {
        ControlFlow.NEXT
    }

fun <E: IMergeable<E>> skipIfdefCplusplusExternC(
    @Suppress("unused") registry: Registry<E>,
    @Suppress("unused") cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int
): Int {
    assert(lines[index].startsWith("#ifdef __cplusplus")) { "Expected #ifdef __cplusplus at line $index" }
    var i = index + 1
    while (i < lines.size && !lines[i].startsWith("#endif")) {
        i++
    }
    if (i >= lines.size) {
        log.warning("Unterminated #ifdef __cplusplus starting at line $index")
    }
    return i + 1
}
