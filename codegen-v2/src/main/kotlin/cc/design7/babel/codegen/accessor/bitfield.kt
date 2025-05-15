package cc.design7.babel.codegen.accessor

import cc.design7.babel.codegen.LayoutField
import cc.design7.babel.codegen.fn
import cc.design7.babel.util.Doc
import cc.design7.babel.util.buildDoc

fun generateBitfieldAccessor(bitfields: LayoutField.Bitfields): Doc = buildDoc {
    for (i in bitfields.bitfields.indices) {
        val member = bitfields.bitfields[i]
        val memberName = member.bitfieldName
        if (memberName == "reserved") {
            continue
        }

        val from = member.offset
        val next = bitfields.bitfields.getOrNull(i + 1)
        val until = next?.offset ?: bitfields.length

        val bitfieldLength = until - from

        val s = "s"
        val sliceSegment = "MemorySegment $s = segment.asSlice(${bitfields.offsetName}, ${bitfields.layoutName});"

        if (bitfieldLength == 1) {
            fn("public", "boolean", memberName) {
                +sliceSegment
                +"return BitfieldUtil.readBit($s, $from);"
            }

            + ""

            fn("public", "void", memberName, "boolean value") {
                +sliceSegment
                +"BitfieldUtil.writeBit($s, $from, value);"
            }
        } else {
            fn("public", "@unsigned int", memberName) {
                +sliceSegment
                +"return BitfieldUtil.readBits($s, $from, $until);"
            }

            +""

            fn("public", "void", memberName, "@unsigned int value") {
                +sliceSegment
                +"BitfieldUtil.writeBits($s, $from, $until, value);"
            }
        }

        if (next != null) +""
    }
}
