package club.doki7.babel.codegen.accessor

import club.doki7.babel.codegen.LayoutField
import club.doki7.babel.codegen.defun
import club.doki7.babel.ctype.CPlatformDependentIntType
import club.doki7.babel.ctype.CType
import club.doki7.babel.util.Doc
import club.doki7.babel.util.buildDoc

fun generateNonRefAccessor(className: String, type: CType, member: LayoutField.Typed): Doc = if (type is CPlatformDependentIntType) {
    generatePlatformDependentIntAccessor(className, type, member)
} else {
    generateFixedTypeAccessor(className, type, member)
}

private fun generatePlatformDependentIntAccessor(className: String, type: CPlatformDependentIntType, member: LayoutField.Typed): Doc {
    return when (type.cType) {
        "long" -> {
            buildDoc {
                defun("public", "long", member.name) {
                    +"return NativeLayout.readCLong(segment, ${member.offsetName});"
                }

                +""

                defun("public", className, member.name, "long value") {
                    +"NativeLayout.writeCLong(segment, ${member.offsetName}, value);"
                    +"return this;"
                }
            }
        }
        "size_t" -> {
            buildDoc {
                defun("public", "@Unsigned long", member.name) {
                    +"return NativeLayout.readCSizeT(segment, ${member.offsetName});"
                }

                +""

                defun("public", className, member.name, "@Unsigned long value") {
                    +"NativeLayout.writeCSizeT(segment, ${member.offsetName}, value);"
                    +"return this;"
                }
            }
        }
        else -> {
            throw Exception("unsupported platform dependent int type $type")
        }
    }
}

private fun generateFixedTypeAccessor(className: String, type: CType, member: LayoutField.Typed): Doc = buildDoc {
    defun("public", type.jType, member.name) {
        +"return segment.get(${member.layoutName}, ${member.offsetName});"
    }

    +""

    defun("public", className, member.name, "${type.jType} value") {
        +"segment.set(${member.layoutName}, ${member.offsetName}, value);"
        +"return this;"
    }
}
