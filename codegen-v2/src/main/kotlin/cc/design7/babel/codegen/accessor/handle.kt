package cc.design7.babel.codegen.accessor

import cc.design7.babel.codegen.LayoutField
import cc.design7.babel.codegen.defun
import cc.design7.babel.ctype.CHandleType
import cc.design7.babel.util.buildDoc

fun generateHandleAccessor(type: CHandleType, member: LayoutField.Typed) = buildDoc {
    defun("public", "@Nullable ${type.name}", member.name) {
        +"MemorySegment s = segment.asSlice(${member.offsetName}, ${member.sizeName});"
        "if (s.address() == 0)" {
            +"return null;"
        }
        +"return new ${type.name}(s);"
    }

    +""

    defun("public", "void", member.name, "@Nullable ${type.name} value") {
        +"segment.set(${member.layoutName}, ${member.offsetName}, value != null ? value.segment() : MemorySegment.NULL);"
    }
}
