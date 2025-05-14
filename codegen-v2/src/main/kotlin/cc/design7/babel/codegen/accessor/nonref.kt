package cc.design7.babel.codegen.accessor

import cc.design7.babel.codegen.FIELD_segment
import cc.design7.babel.codegen.LayoutField
import cc.design7.babel.codegen.fn
import cc.design7.babel.ctype.CPlatformDependentIntType
import cc.design7.babel.ctype.CType
import cc.design7.babel.util.Doc
import cc.design7.babel.util.buildDoc

fun generateNonRefAccessor(type: CType, member: LayoutField.Typed): Doc = if (type is CPlatformDependentIntType) {
    generatePlatformDependentIntAccessor(type, member)
} else {
    generateFixedTypeAccessor(type, member)
}

private fun generatePlatformDependentIntAccessor(type: CPlatformDependentIntType, member: LayoutField.Typed): Doc {
    return when (type.cType) {
        "long" -> {
            buildDoc {
                fn("public", "long", member.name) {
                    +"return NativeLayout.readCLong($FIELD_segment, ${member.offsetName});"
                }

                +""

                fn("public", "void", member.name, "long value") {
                    +"NativeLayout.writeCLong($FIELD_segment, ${member.offsetName}, value);"
                }
            }
        }
        "size_t" -> {
            buildDoc {
                fn("public", "@unsigned long", member.name) {
                    +"return NativeLayout.readCSizeT($FIELD_segment, ${member.offsetName});"
                }

                +""

                // FIXME: no need to be `@unsigned long value`?
                fn("public", "void", member.name, "long value") {
                    +"NativeLayout.writeCSizeT($FIELD_segment, ${member.offsetName}, value);"
                }
            }
        }
        else -> {
            throw Exception("unsupported platform dependent int type $type")
        }
    }
}

private fun generateFixedTypeAccessor(type: CType, member: LayoutField.Typed): Doc {
    """
        public ${type.jType} ${member.name}() {
            return segment.get(LAYOUT$${member.name}, OFFSET$${member.name});
        }

        public void ${member.name}(${type.jType} value) {
            segment.set(LAYOUT$${member.name}, OFFSET$${member.name}, value);
        }
    """.trimIndent()

    return buildDoc {
        fn("public", type.jType, member.name) {
            +"return $FIELD_segment.get(${member.layoutName}, ${member.offsetName});"
        }

        +""

        fn("public", "void", member.name, "${type.jType} value") {
            +"segment.set(${member.layoutName}, ${member.offsetName}, value);"
        }
    }
}