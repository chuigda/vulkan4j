package club.doki7.babel.drv

import club.doki7.babel.codegen.CodegenOptions
import club.doki7.babel.codegen.generateCommandFile
import club.doki7.babel.codegen.generateConstants
import club.doki7.babel.codegen.generateEnumeration
import club.doki7.babel.codegen.generateFunctionTypedefs
import club.doki7.babel.codegen.generateHandle
import club.doki7.babel.codegen.generateStructure
import club.doki7.babel.extract.stb.extractSTBImageHeader
import club.doki7.babel.extract.stb.extractSTBImageResizeHeader
import club.doki7.babel.extract.stb.extractSTBTrueTypeHeader
import club.doki7.babel.registry.EmptyMergeable
import club.doki7.babel.registry.OpaqueHandleTypedef
import club.doki7.babel.registry.Registry
import club.doki7.babel.util.render
import java.io.File

fun main() {
    val stbImageRegistry = extractSTBImageHeader()
    val stbTrueTypeRegistry = extractSTBTrueTypeHeader()
    val stbImageResizeRegistry = extractSTBImageResizeHeader()

    val stbImageCodegenOptions = CodegenOptions(
        packageName = "club.doki7.stb.image",
        extraImport = listOf(),
        constantClassName = "STBImageConstants",
        functionTypeClassName = "STBIFunctionTypes",
        refRegistries = listOf()
    )
    val stbTrueTypeCodegenOptions = CodegenOptions(
        packageName = "club.doki7.stb.truetype",
        extraImport = listOf(),
        constantClassName = "STBTrueTypeConstants",
        functionTypeClassName = "STBTTFunctionTypes",
        refRegistries = listOf()
    )
    val stbImageResizeCodegenOptions = CodegenOptions(
        packageName = "club.doki7.stb.imageresize",
        extraImport = listOf(),
        constantClassName = "STBImageResizeConstants",
        functionTypeClassName = "STBIRFunctionTypes",
        refRegistries = listOf()
    )

    codegen("stb/src/main/java/club/doki7/stb/image", "STBI", stbImageRegistry, stbImageCodegenOptions)
    codegen("stb/src/main/java/club/doki7/stb/truetype", "STBTT", stbTrueTypeRegistry, stbTrueTypeCodegenOptions)
    codegen("stb/src/main/java/club/doki7/stb/imageresize", "STBIR", stbImageResizeRegistry, stbImageResizeCodegenOptions)
}

private fun codegen(
    packageDir: String,
    commandClassName: String,
    registry: Registry<EmptyMergeable>,
    codegenOptions: CodegenOptions
) {
    val commandsDoc = generateCommandFile(
        registry,
        commandClassName,
        registry.commands.values
            .filter { it -> !it.params.any { param -> param.type.cDisplay.contains("FILE*") } }
            .sortedBy { it.name },
        codegenOptions,
        implConstantClass = false,
        subpackage = null
    )
    File("$packageDir/$commandClassName.java").writeText(render(commandsDoc))

    val functionTypedefsDoc = generateFunctionTypedefs(registry, codegenOptions)
    File("$packageDir/${codegenOptions.functionTypeClassName}.java").writeText(render(functionTypedefsDoc))

    val constantsDoc = generateConstants(registry, codegenOptions)
    File("$packageDir/${codegenOptions.constantClassName}.java").writeText(render(constantsDoc))

    if (registry.enumerations.isNotEmpty()) {
        for (enum in registry.enumerations.values) {
            val enumDoc = generateEnumeration(registry, enum, codegenOptions)
            File("$packageDir/enumtype/${enum.name}.java").writeText(render(enumDoc))
        }
    }

    if (registry.structures.isNotEmpty()) {
        for (structure in registry.structures.values) {
            val structureDoc = generateStructure(registry, structure, false, codegenOptions)
            File("$packageDir/datatype/${structure.name}.java").writeText(render(structureDoc))
        }
    }

    if (registry.opaqueTypedefs.isNotEmpty()) {
        for (opaqueTypedef in registry.opaqueTypedefs.values) {
            val handle = OpaqueHandleTypedef(opaqueTypedef.name)
            val handleDoc = generateHandle(registry, handle, codegenOptions)
            File("$packageDir/handle/${handle.name}.java").writeText(render(handleDoc))
        }
    }
}
