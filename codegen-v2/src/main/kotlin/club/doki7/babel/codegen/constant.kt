package club.doki7.babel.codegen

import club.doki7.babel.ctype.lowerIdentifierType
import club.doki7.babel.registry.RegistryBase
import club.doki7.babel.util.buildDoc

fun generateConstants(registry: RegistryBase, codegenOptions: CodegenOptions) = buildDoc {
    val constants = registry.constants.values

    +"package ${codegenOptions.packageName};"
    +""

    +"import club.doki7.ffm.annotation.*;"
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

        for (constant in nonStringConstants.sortedBy { it.name }) {
            val docLink = codegenOptions.seeLinkProvider(constant)
            if (docLink != null) {
                +"/// @see $docLink"
            }

            val ctype = lowerIdentifierType(registry, codegenOptions.refRegistries, constant.type)
            +"public static final ${ctype.jType} ${constant.name} = ${constant.expr};"
        }

        if (stringConstants.isNotEmpty() && nonStringConstants.isNotEmpty()) {
            +""
        }

        for (constant in stringConstants.sortedBy { it.name }) {
            val docLink = codegenOptions.seeLinkProvider(constant)
            if (docLink != null) {
                +"/// @see $docLink"
            }

            +"public static final String ${constant.name} = ${constant.expr};"
        }

        if (stringConstants.isNotEmpty() || nonStringConstants.isNotEmpty()) {
            +""
        }

        +prohibitUserConstruct(codegenOptions.constantClassName)
    }
    +"}"
}
