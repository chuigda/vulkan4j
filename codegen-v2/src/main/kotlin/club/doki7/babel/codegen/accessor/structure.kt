package club.doki7.babel.codegen.accessor

import club.doki7.babel.codegen.LayoutField
import club.doki7.babel.codegen.defun
import club.doki7.babel.ctype.CStructType
import club.doki7.babel.util.Doc
import club.doki7.babel.util.buildDoc

fun generateStructureTypeAccessor(type: CStructType, member: LayoutField.Typed): Doc {
    return buildDoc {
        defun("public", type.name, member.name) {
            +"return new ${type.name}(segment.asSlice(${member.offsetName}, ${member.layoutName}));"
        }

        +""

        defun("public", "void", member.name, "${type.name} value") {
            +"MemorySegment.copy(value.segment(), 0, segment, ${member.offsetName}, ${member.sizeName});"
        }
    }
}
