package cc.design7.babel.codegen

import cc.design7.babel.ctype.lowerType
import cc.design7.babel.registry.RegistryBase
import cc.design7.babel.util.buildDoc

fun generateFunctionTypedefs(
    registry: RegistryBase,
    codegenOptions: CodegenOptions
) = buildDoc {
    val packageName = codegenOptions.packageName

    +"package $packageName;"
    +""
    imports("java.lang.foreign.*")
    imports("cc.design7.ffm.NativeLayout")
    imports("$packageName.datatype.*")
    +""
    +"public final class ${codegenOptions.functionTypeClassName} {"

    indent {
        registry.functionTypedefs.values.sortedBy { it.name }.forEach {
            val seeLink = codegenOptions.seeLinkProvider(it)
            if (seeLink != null) {
                +"/// @see $seeLink"
            }

            if (it.result == null) {
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
    }
    +"}"
}
