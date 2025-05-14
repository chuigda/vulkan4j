package cc.design7.babel.codegen.accessor

import cc.design7.babel.codegen.BitfieldUtil
import cc.design7.babel.codegen.FIELD_segment
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
            val until = bitfields.bitfields.getOrNull(i + 1)?.offset ?: bitfields.length

            fn("public", "int", memberName) {
                +"return ${BitfieldUtil.readBits(FIELD_segment, "$from", "$until")};"
            }

            val value = "value"

            +""

            fn("public", "void", memberName, "int $value") {
                +BitfieldUtil.writeBits(FIELD_segment, "$from", "$until", value)
            }

            +""
        }
    }
}