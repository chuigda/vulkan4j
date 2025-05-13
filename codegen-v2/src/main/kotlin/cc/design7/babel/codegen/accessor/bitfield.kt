package cc.design7.babel.codegen.accessor

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
                +"return BitfieldUtil.readBits(segment, ${from}, ${until})"
            }
            +"}"

            +"public void ${memberName}(int value) {"
            indent {
                +"BitfieldUtil.writeBits(segment, ${from}, ${until}, value)"
            }
            +"}"
        }
    }
}