package cc.design7.babel.codegen

import cc.design7.babel.util.DocList
import org.intellij.lang.annotations.Language

inline fun DocList.fn(
    @Language("Java", suffix = " void foo() {}") modifiers: String,
    @Language("Java", suffix = " foo() {}") returnType: String,
    @Language("Java", prefix = "void ", suffix = "() {}") name: String,
    @Language("Java", prefix = "void foo(", suffix = ") {}") vararg parameters: String,
    builder: DocList.() -> Unit,
) {
    "$modifiers $returnType $name(${parameters.joinToString()})"(builder)
}
