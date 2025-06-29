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
    imports("java.lang.invoke.*")
    imports("club.doki7.ffm.annotation.*")
    imports("club.doki7.ffm.NativeLayout")
    imports("org.jetbrains.annotations.NotNull")
    importDatatypes(registry, codegenOptions)
    importBitmasks(registry, codegenOptions)
    importEnumtypes(registry, codegenOptions)
    importHandles(registry, codegenOptions)
    +""
    +"public final class ${codegenOptions.functionTypeClassName} {"

    indent {
        val defs = registry.functionTypedefs.values.sortedBy { it.name }

        defs.forEachIndexed { idx, it ->
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
                    // TODO: maybe joinToString?
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

        defs.forEach { def ->
            +"@FunctionalInterface"
            "public interface ${def.name}" {
                val retCType = lowerType(registry, codegenOptions.refRegistries, def.result)
                +"${retCType.jType} invoke(${
                    def.params.asSequence().mapIndexed({ idx, t -> idx to t }).joinToString { (idx, it) ->
                        // TODO: we may extract parameter name
                        lowerType(registry, codegenOptions.refRegistries, it).jType + " p$idx"
                    }
                });"

                +""

                defun("static", "MethodHandle", "of", "@NotNull ${def.name} lambda") {
                    "try" {
                        +"return MethodHandles.lookup().findVirtual(${def.name}.class, \"invoke\", ${def.name}.toMethodType()).bindTo(lambda);"
                    }
                    "catch (NoSuchMethodException | IllegalAccessException e)" {
                        +"throw new RuntimeException(e);"
                    }
                }

                +""

                defun("static", "MemorySegment", "ofNative", "@NotNull ${def.name} lambda") {
                    +"return ofNative(Arena.global(), lambda);"
                }

                +""

                defun("static", "MemorySegment", "ofNative", "@NotNull Arena arena", "@NotNull ${def.name} lambda") {
                    +"return Linker.nativeLinker().upcallStub(of(lambda), ${def.name}, arena);"
                }
            }

            +""
        }

        +prohibitUserConstruct(codegenOptions.functionTypeClassName)
    }
    +"}"
}
