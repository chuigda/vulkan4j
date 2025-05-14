package cc.design7.babel.codegen.accessor

import cc.design7.babel.codegen.FIELD_segment
import cc.design7.babel.codegen.LayoutField
import cc.design7.babel.codegen.fn
import cc.design7.babel.ctype.CHandleType
import cc.design7.babel.util.Doc
import cc.design7.babel.util.buildDoc

fun generateHandleAccessor(type: CHandleType, member: LayoutField.Typed): Doc {
    return buildDoc {
        fn("public", "@Nullable ${type.name}", member.name) {
            +"MemorySegment s = $FIELD_segment.asSlice(${member.offsetName}, ${member.sizeName});"
            "if (s.address() == 0)" {
                +"return null;"
            }
            +"return new ${type.name}(s);"
        }

        +""

        fn("public", "void", member.name) {
            +"$FIELD_segment.set(${member.layoutName}, ${member.offsetName}, value != null ? value.segment() : MemorySegment.NULL);"
        }
    }
}