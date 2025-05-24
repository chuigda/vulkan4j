package club.doki7.babel.drv

import club.doki7.babel.codegen.CodegenOptions
import club.doki7.babel.codegen.generateBitmask
import club.doki7.babel.codegen.generateCommandFile
import club.doki7.babel.codegen.generateEnumeration
import club.doki7.babel.codegen.generateFunctionTypedefs
import club.doki7.babel.codegen.generateHandle
import club.doki7.babel.codegen.generateStructure
import club.doki7.babel.codegen.generateStructureInterface
import club.doki7.babel.extract.vma.extractVMAHeader
import club.doki7.babel.registry.RegistryBase
import club.doki7.babel.util.render
import java.io.File

private const val packageDir = "vma/src/main/java/club/doki7/vma"

fun vmaMain(vulkanRegistry: RegistryBase) {
    val registry = extractVMAHeader()

    val codegenOptions = CodegenOptions(
        packageName = "club.doki7.vma",
        extraImport = listOf(
            "club.doki7.vulkan.bitmask.*",
            "club.doki7.vulkan.datatype.*",
            "club.doki7.vulkan.enumtype.*",
            "club.doki7.vulkan.handle.*"
        ),
        constantClassName = "VMAConstants",
        functionTypeClassName = "VMAFunctionTypes",
        refRegistries = listOf(vulkanRegistry),
    )

    val functionTypeDoc = generateFunctionTypedefs(registry, codegenOptions)
    File("$packageDir/${codegenOptions.functionTypeClassName}.java")
        .writeText(render(functionTypeDoc))

    val bitmaskAndEnumCodegenOptiosn = codegenOptions.copy(extraImport = emptyList())
    for (bitmask in registry.bitmasks.values) {
        val bitmaskDoc = generateBitmask(registry, bitmask, bitmaskAndEnumCodegenOptiosn)
        File("$packageDir/bitmask/${bitmask.name}.java")
            .writeText(render(bitmaskDoc))
    }

    for (enumeration in registry.enumerations.values) {
        val enumerationDoc = generateEnumeration(registry, enumeration, bitmaskAndEnumCodegenOptiosn)
        File("$packageDir/enumtype/${enumeration.name}.java")
            .writeText(render(enumerationDoc))
    }

    val structureCodegenOptions = codegenOptions.copy(
        extraImport = listOf(
            "club.doki7.vulkan.bitmask.*",
            "club.doki7.vulkan.datatype.*",
            "club.doki7.vulkan.enumtype.*",
            "club.doki7.vulkan.handle.*",
            "static club.doki7.vulkan.VkConstants.*"
        )
    )
    for (structure in registry.structures.values) {
        val structureInterfaceDoc = generateStructureInterface(structure, structureCodegenOptions)
        File("$packageDir/datatype/I${structure.name}.java")
            .writeText(render(structureInterfaceDoc))

        val structureDoc = generateStructure(registry, structure, false, codegenOptions)
        File("$packageDir/datatype/${structure.name}.java")
            .writeText(render(structureDoc))
    }

    for (handle in registry.opaqueHandleTypedefs.values) {
        val handleDoc = generateHandle(registry, handle, codegenOptions)
        File("$packageDir/handle/${handle.name}.java")
            .writeText(render(handleDoc))
    }

    val commandFile = generateCommandFile(
        registry,
        "VMA",
        registry.commands.values.toList(),
        codegenOptions,
        null
    )
    File("$packageDir/VMA.java")
        .writeText(render(commandFile))
}
