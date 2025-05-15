package cc.design7.babel.codegen.accessor

import cc.design7.babel.codegen.BitfieldUtil
import cc.design7.babel.codegen.LayoutField
import cc.design7.babel.codegen.fn
import cc.design7.babel.util.Doc
import cc.design7.babel.util.buildDoc

fun generateBitfieldAccessor(bitfields: LayoutField.Bitfields): Doc {
    return buildDoc {
        for (i in bitfields.bitfields.indices) {
            val member = bitfields.bitfields[i]
            val memberName = member.bitfieldName
            val from = member.offset
            val next = bitfields.bitfields.getOrNull(i + 1)
            val until = next?.offset ?: bitfields.length

            val s = "s"
            val sliceSegment = "MemorySegment $s = segment.asSlice(${bitfields.offsetName}, ${bitfields.layoutName});"

            fn("public", "int", memberName) {
                +sliceSegment
                +"return ${BitfieldUtil.readBits(s, "$from", "$until")};"
            }

            val value = "value"

            +""

            fn("public", "void", memberName, "int $value") {
                +sliceSegment
                +BitfieldUtil.writeBits(s, "$from", "$until", value)
            }

            if (next != null) +""
        }
    }
}
