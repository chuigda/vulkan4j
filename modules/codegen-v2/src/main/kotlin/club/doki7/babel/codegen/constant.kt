package club.doki7.babel.codegen

import club.doki7.babel.ctype.lowerIdentifierType
import club.doki7.babel.registry.Constant
import club.doki7.babel.registry.RegistryBase
import club.doki7.babel.util.buildDoc
import club.doki7.babel.util.isDecOrHexNumber

fun generateConstants(
    registry: RegistryBase,
    codegenOptions: CodegenOptions,
    constants: List<Constant> = registry.constants.values.toList()
) = buildDoc {
    +"package ${codegenOptions.packageName};"
    +""

    imports("club.doki7.ffm.annotation.*")
    if (codegenOptions.extraImport.isNotEmpty()) {
        for (import in codegenOptions.extraImport) imports(import)
    }
    +""

    +"public interface ${codegenOptions.constantClassName} {"
    indent {
        val (stringConstants, nonStringConstants) = constants
            .partition { it.type.ident.value == "CONSTANTS_JavaString" }

        val (nonAliasConstants, aliasConstants) = nonStringConstants
            .partition { it.expr.isDecOrHexNumber() }

        for (constant in nonAliasConstants.sortedBy { it.name }) {
            val docLink = codegenOptions.seeLinkProvider(constant)
            if (docLink != null) {
                +"/// @see $docLink"
            }

            val ctype = lowerIdentifierType(registry, codegenOptions.refRegistries, constant.type)
            +"${ctype.jType} ${constant.name} = ${constant.expr};"
        }

        for (constant in aliasConstants.sortedBy { it.name }) {
            val docLink = codegenOptions.seeLinkProvider(constant)
            if (docLink != null) {
                +"/// @see $docLink"
            }

            val ctype = lowerIdentifierType(registry, codegenOptions.refRegistries, constant.type)
            +"${ctype.jType} ${constant.name} = ${constant.expr};"
        }

        if (stringConstants.isNotEmpty() && nonStringConstants.isNotEmpty()) {
            +""
        }

        for (constant in stringConstants.sortedBy { it.name }) {
            val docLink = codegenOptions.seeLinkProvider(constant)
            if (docLink != null) {
                +"/// @see $docLink"
            }

            +"String ${constant.name} = ${constant.expr};"
        }
    }
    +"}"
}
