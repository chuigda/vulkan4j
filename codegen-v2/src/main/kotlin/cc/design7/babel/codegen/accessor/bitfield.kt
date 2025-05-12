package cc.design7.babel.codegen.accessor

import cc.design7.babel.registry.Member
import cc.design7.babel.util.Doc
import cc.design7.babel.util.buildDoc

fun generateBitfieldAccessor(member: Member, next: Member): Doc {
    val bitfieldName = "bitfield$${member.name}_${next.name}"

    return buildDoc {
        +"public int ${member.name}() {"
        indent { +"return segment.get(LAYOUT$$bitfieldName, OFFSET$$bitfieldName) >> 8;" }
        +"}"

        +"public void ${member.name}(int value) {"
        indent {
            +"int original = segment.get(LAYOUT$$bitfieldName, OFFSET$$bitfieldName);"
            +"int newValue = (original & 0xFF) | (value << 8);"
            +"segment.set(LAYOUT$$bitfieldName, OFFSET$$bitfieldName, newValue);"
        }
        +"}"

        +"public int ${next.name}() {"
        indent { +"return segment.get(LAYOUT$$bitfieldName, OFFSET$$bitfieldName) & 0xFF;" }
        +"}"

        +"public void ${next.name}(int value) {"
        indent {
            +"int original = segment.get(LAYOUT$$bitfieldName, OFFSET$$bitfieldName);"
            +"int newValue = (original & 0xFFFFFF00) | value;"
            +"segment.set(LAYOUT$$bitfieldName, OFFSET$$bitfieldName, newValue);"
        }
        +"}"
    }
}