package cc.design7.babel.codegen.accessor

import cc.design7.babel.util.Doc
import cc.design7.babel.util.DocText

object BitfieldUtil {
    const val NAME_BitfieldUtil = "BitfieldUtil"

    fun readBits(from: String, start: String, end: String): String {
        return "$NAME_BitfieldUtil.readBits($from, $start, $end)"
    }

    fun writeBits(to: String, start: String, end: String, value: String): Doc {
        return DocText("$NAME_BitfieldUtil.writeBits($to, $start, $end, $value);")
    }
}