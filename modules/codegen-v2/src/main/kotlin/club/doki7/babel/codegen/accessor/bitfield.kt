package club.doki7.babel.codegen.accessor

import club.doki7.babel.codegen.LayoutField
import club.doki7.babel.codegen.defun
import club.doki7.babel.codegen.isUnusedReservedField
import club.doki7.babel.util.buildDoc

fun generateBitfieldAccessor(className: String, bitfields: LayoutField.Bitfields) = buildDoc {
    for (i in bitfields.bitfields.indices) {
        val member = bitfields.bitfields[i]
        val memberName = member.bitfieldName
        if (memberName.isUnusedReservedField()) {
            continue
        }

        val from = member.offset
        val next = bitfields.bitfields.getOrNull(i + 1)
        val until = next?.offset ?: bitfields.length

        val bitfieldLength = until - from

        val s = "s"
        val sliceSegment = "MemorySegment $s = segment.asSlice(${bitfields.offsetName}, ${bitfields.layoutName});"

        if (bitfieldLength == 1) {
            defun("public", "boolean", memberName) {
                +sliceSegment
                +"return BitfieldUtil.readBit($s, $from);"
            }

            + ""

            defun("public", className, memberName, "boolean value") {
                +sliceSegment
                +"BitfieldUtil.writeBit($s, $from, value);"
                +"return this;"
            }
        } else {
            defun("public", "@Unsigned int", memberName) {
                +sliceSegment
                +"return BitfieldUtil.readBits($s, $from, $until);"
            }

            +""

            defun("public", className, memberName, "@Unsigned int value") {
                +sliceSegment
                +"BitfieldUtil.writeBits($s, $from, $until, value);"
                +"return this;"
            }
        }

        if (next != null && next.bitfieldName != "reserved") +""
    }
}
