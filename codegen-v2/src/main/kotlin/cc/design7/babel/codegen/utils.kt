package cc.design7.babel.codegen

import cc.design7.babel.util.Doc
import cc.design7.babel.util.DocList
import cc.design7.babel.util.DocText
import org.intellij.lang.annotations.Language

object BitfieldUtil {
    const val NAME_BitfieldUtil = "BitfieldUtil"

    fun readBits(from: String, start: String, end: String): String {
        return "$NAME_BitfieldUtil.readBits($from, $start, $end)"
    }

    fun writeBits(to: String, start: String, end: String, value: String): Doc {
        return DocText("$NAME_BitfieldUtil.writeBits($to, $start, $end, $value);")
    }
}

inline fun DocList.fn(
    @Language("Java", suffix = " void foo() {}") modifiers: String,
    @Language("Java", suffix = " foo() {}") returnType: String,
    @Language("Java", prefix = "void ", suffix = "() {}") name: String,
    @Language("Java", prefix = "void foo(", suffix = ") {}") vararg parameters: String,
    builder: DocList.() -> Unit,
) {
    "$modifiers $returnType $name(${parameters.joinToString()})"(builder)
}