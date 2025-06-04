package club.doki7.babel.codegen

import club.doki7.babel.ctype.lowerType
import club.doki7.babel.registry.IdentifierType
import club.doki7.babel.registry.RegistryBase
import club.doki7.babel.util.buildDoc

fun generateFunctionTypedefs(
    registry: RegistryBase,
    codegenOptions: CodegenOptions
) = buildDoc {
    val packageName = codegenOptions.packageName

    +"package $packageName;"
    +""
    imports("java.lang.foreign.*")
    imports("club.doki7.ffm.NativeLayout")
    if (registry.structures.isNotEmpty() && registry.unions.isNotEmpty()) {
        imports("$packageName.datatype.*")
    }
    +""
    +"public final class ${codegenOptions.functionTypeClassName} {"

    indent {
        registry.functionTypedefs.values.sortedBy { it.name }.forEachIndexed { idx, it ->
            val seeLink = codegenOptions.seeLinkProvider(it)
            if (seeLink != null) {
                +"/// @see $seeLink"
            }

            if (it.result is IdentifierType && it.result.ident.original == "void") {
                if (it.params.isEmpty()) {
                    +"public static final FunctionDescriptor ${it.name} = FunctionDescriptor.ofVoid();"
                } else {
                    +"public static final FunctionDescriptor ${it.name} = FunctionDescriptor.ofVoid("
                    indent {
                        it.params.forEachIndexed { index, param ->
                            val cType = lowerType(registry, codegenOptions.refRegistries, param)
                            +"${cType.jLayout}${if (index == it.params.size - 1) "" else ","}"
                        }
                    }
                    +");"
                }
            } else {
                +"public static final FunctionDescriptor ${it.name} = FunctionDescriptor.of("
                indent {
                    val retCType = lowerType(registry, codegenOptions.refRegistries, it.result)
                    +"${retCType.jLayout}${if (it.params.isEmpty()) "" else ","}"
                    it.params.forEachIndexed { index, param ->
                        val cType = lowerType(registry, codegenOptions.refRegistries, param)
                        +"${cType.jLayout}${if (index == it.params.size - 1) "" else ","}"
                    }
                }
                +");"
            }
            +""
        }

        +prohibitUserConstruct(codegenOptions.functionTypeClassName)
    }
    +"}"
}
