package club.doki7.babel.codegen.accessor

import club.doki7.babel.codegen.LayoutField
import club.doki7.babel.codegen.defun
import club.doki7.babel.ctype.*
import club.doki7.babel.util.Doc
import club.doki7.babel.util.buildDoc

fun generateNonRefAccessor(className: String, type: CType, member: LayoutField.Typed): Doc =
    if (type is CPlatformDependentIntType) {
        generatePlatformDependentIntAccessor(className, type, member)
    } else {
        generateFixedTypeAccessor(className, type, member)
    }

private fun generatePlatformDependentIntAccessor(
    className: String,
    type: CPlatformDependentIntType,
    member: LayoutField.Typed
): Doc {
    return when (type) {
        is CLongType -> {
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
        is CSizeType -> {
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
        is CWCharType -> buildDoc {
            defun("public", "@Unsigned int", member.name) {
                +"return NativeLayout.readWCharT(segment, ${member.offsetName});"
            }

            +""

            defun("public", className, member.name, "@Unsigned int value") {
                +"NativeLayout.writeWCharT(segment, ${member.offsetName}, value);"
                +"return this;"
            }
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
