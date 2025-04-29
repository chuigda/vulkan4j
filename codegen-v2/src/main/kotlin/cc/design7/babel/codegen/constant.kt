package cc.design7.babel.codegen

import cc.design7.babel.ctype.lowerIdentifierType
import cc.design7.babel.registry.RegistryBase
import cc.design7.babel.util.buildDoc

fun generateConstants(registry: RegistryBase, codegenOptions: CodegenOptions) = buildDoc {
    val constants = registry.constants.values

    +"package ${codegenOptions.packageName};"
    +""

    +"import cc.design7.ffm.annotation.*;"
    if (codegenOptions.extraImport.isNotEmpty()) {
        for (import in codegenOptions.extraImport) {
            +"import $import;"
        }
    }
    +""

    +"public final class ${codegenOptions.constantClassName} {"
    indent {
        val (stringConstants, nonStringConstants) = constants
            .partition { it.type.ident.value == "CONSTANTS_JavaString" }

        for (constant in nonStringConstants) {
            val ctype = lowerIdentifierType(registry, codegenOptions.refRegistries, constant.type)
            +"public static final ${ctype.jType} ${constant.name} = ${constant.expr};"
        }

        if (stringConstants.isNotEmpty() && nonStringConstants.isNotEmpty()) {
            +""
        }

        for (constant in stringConstants) {
            +"public static final String ${constant.name} = ${constant.expr};"
        }

        if (stringConstants.isNotEmpty() || nonStringConstants.isNotEmpty()) {
            +""
        }

        +"/// Constructing this class is nonsense so the constructor is made private."
        +"private ${codegenOptions.constantClassName}() {}"
    }
    +"}"
}
