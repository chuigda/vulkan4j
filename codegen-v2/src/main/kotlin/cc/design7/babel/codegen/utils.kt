package cc.design7.babel.codegen

import cc.design7.babel.util.DocList
import org.intellij.lang.annotations.Language

fun DocList.imports(
    @Language("Java", prefix = "import ", suffix = ";") path: String,
    static: Boolean = false
) {
    +"import ${if (static) "static " else ""}$path;"
}

fun DocList.defConst(type: String, name: String, value: String) {
    +"public static final $type $name = $value;"
}

inline fun DocList.defun(
    @Language("Java", suffix = " void foo() {}") modifiers: String,
    @Language("Java", suffix = " foo() {}") returnType: String,
    @Language("Java", prefix = "void ", suffix = "() {}") name: String,
    @Language("Java", prefix = "void foo(", suffix = ") {}") vararg parameters: String,
    builder: DocList.() -> Unit,
) {
    "$modifiers $returnType $name(${parameters.joinToString()})"(builder)
}
