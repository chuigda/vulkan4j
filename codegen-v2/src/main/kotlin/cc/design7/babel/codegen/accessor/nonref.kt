package cc.design7.babel.codegen.accessor

import cc.design7.babel.codegen.LayoutField
import cc.design7.babel.codegen.defun
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
                defun("public", "long", member.name) {
                    +"return NativeLayout.readCLong(segment, ${member.offsetName});"
                }

                +""

                defun("public", "void", member.name, "long value") {
                    +"NativeLayout.writeCLong(segment, ${member.offsetName}, value);"
                }
            }
        }
        "size_t" -> {
            buildDoc {
                defun("public", "@unsigned long", member.name) {
                    +"return NativeLayout.readCSizeT(segment, ${member.offsetName});"
                }

                +""

                defun("public", "void", member.name, "@unsigned long value") {
                    +"NativeLayout.writeCSizeT(segment, ${member.offsetName}, value);"
                }
            }
        }
        else -> {
            throw Exception("unsupported platform dependent int type $type")
        }
    }
}

private fun generateFixedTypeAccessor(type: CType, member: LayoutField.Typed): Doc = buildDoc {
    defun("public", type.jType, member.name) {
        +"return segment.get(${member.layoutName}, ${member.offsetName});"
    }

    +""

    defun("public", "void", member.name, "${type.jType} value") {
        +"segment.set(${member.layoutName}, ${member.offsetName}, value);"
    }
}
