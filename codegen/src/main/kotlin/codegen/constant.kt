package codegen

import Constant
import appendLn

fun generateConstants(packageName: String, constantClassName: String, constants: List<Constant>) = buildString {
    appendLn("package $packageName;")
    appendLn()
    appendLn("public final class $constantClassName {")
    for (constant in constants) {
        appendLn(indent("public static final int ${constant.name} = ${constant.expr};", 1))
    }
    appendLn("}")
}
