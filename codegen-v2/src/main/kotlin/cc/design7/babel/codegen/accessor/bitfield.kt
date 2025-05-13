package cc.design7.babel.codegen.accessor

import cc.design7.babel.codegen.FIELD_segment
import cc.design7.babel.codegen.LayoutField
import cc.design7.babel.util.Doc
import cc.design7.babel.util.buildDoc

fun generateBitfieldAccessor(layoutName: String, bitfields: LayoutField.Bitfields): Doc {
    return buildDoc {
        for (i in bitfields.bitfields.indices) {
            val member = bitfields.bitfields[i]
            val memberName = member.bitfieldName
            val from = member.offset            // TODO: inline or use [member.offsetName]
            val until = bitfields.bitfields.getOrNull(i + 1)?.offset ?: bitfields.length

            +"public int ${memberName}() {"
            indent {
                +"return ${BitfieldUtil.readBits(FIELD_segment, "$from", "$until")};"
            }
            +"}"

            val value = "value"

            +"public void ${memberName}(int $value) {"
            indent {
                +BitfieldUtil.writeBits(FIELD_segment, "$from", "$until", value)
            }
            +"}"
        }
    }
}