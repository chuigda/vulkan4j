package club.doki7.babel.codegen.accessor

import club.doki7.babel.codegen.LayoutField
import club.doki7.babel.codegen.defun
import club.doki7.babel.ctype.CHandleType
import club.doki7.babel.util.buildDoc

fun generateHandleAccessor(className: String, type: CHandleType, member: LayoutField.Typed) = buildDoc {
    defun("public", "@Nullable ${type.name}", member.name) {
        +"MemorySegment s = segment.asSlice(${member.offsetName}, ${member.sizeName});"
        "if (s.equals(MemorySegment.NULL))" {
            +"return null;"
        }
        +"return new ${type.name}(s);"
    }

    +""

    defun("public", className, member.name, "@Nullable ${type.name} value") {
        +"segment.set(${member.layoutName}, ${member.offsetName}, value != null ? value.segment() : MemorySegment.NULL);"
        +"return this;"
    }
}
