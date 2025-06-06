package club.doki7.babel.codegen.accessor

import club.doki7.babel.codegen.LayoutField
import club.doki7.babel.codegen.defun
import club.doki7.babel.ctype.CStructType
import club.doki7.babel.util.Doc
import club.doki7.babel.util.buildDoc

fun generateStructureTypeAccessor(className: String, type: CStructType, member: LayoutField.Typed): Doc {
    return buildDoc {
        defun("public", "@NotNull ${type.name}", member.name) {
            +"return new ${type.name}(segment.asSlice(${member.offsetName}, ${member.layoutName}));"
        }

        +""

        defun("public", className, member.name, "@NotNull ${type.name} value") {
            +"MemorySegment.copy(value.segment(), 0, segment, ${member.offsetName}, ${member.sizeName});"
            +"return this;"
        }

        +""

        defun("public", className, member.name, "Consumer<@NotNull ${type.name}> consumer") {
            +"consumer.accept(${member.name}());"
            +"return this;"
        }
    }
}
