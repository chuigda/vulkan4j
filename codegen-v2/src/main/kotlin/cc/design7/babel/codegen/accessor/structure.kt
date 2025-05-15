package cc.design7.babel.codegen.accessor

import cc.design7.babel.codegen.LayoutField
import cc.design7.babel.codegen.fn
import cc.design7.babel.ctype.CStructType
import cc.design7.babel.util.Doc
import cc.design7.babel.util.buildDoc

fun generateStructureTypeAccessor(type: CStructType, member: LayoutField.Typed): Doc {
    return buildDoc {
        fn("public", type.name, member.name) {
            +"return new ${type.name}(segment.asSlice(${member.offsetName}, ${member.layoutName}));"
        }

        +""

        fn("public", "void", member.name, "${type.name} value") {
            +"MemorySegment.copy(value.segment(), 0, segment, ${member.offsetName}, ${member.sizeName});"
        }
    }
}
