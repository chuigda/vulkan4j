package club.doki7.babel.drv

import club.doki7.babel.codegen.CodegenOptions
import club.doki7.babel.codegen.generateCommandFile
import club.doki7.babel.codegen.generateConstants
import club.doki7.babel.codegen.generateStructure
import club.doki7.babel.codegen.generateStructureInterface
import club.doki7.babel.extract.glfw3.extractGLFWHeader
import club.doki7.babel.registry.RegistryBase
import club.doki7.babel.util.render
import java.io.File

private const val packageDir = "glfw/src/main/java/club/doki7/glfw"

fun glfw3Main(vulkanRegistry: RegistryBase, vulkanAdditionalRegistry: RegistryBase) {
    val registry = extractGLFWHeader()

    val codegenOptions = CodegenOptions(
        packageName = "club.doki7.glfw",
        extraImport = listOf(),
        constantClassName = "GLFWConstants",
        functionTypeClassName = "GLFWFunctionTypes",
        refRegistries = listOf(vulkanRegistry, vulkanAdditionalRegistry)
    )

    val constantsDoc = generateConstants(registry, codegenOptions)
    File("$packageDir/${codegenOptions.constantClassName}.java")
        .writeText(render(constantsDoc))

    val commandCodegenOptions = codegenOptions.copy(
        extraImport = listOf(
            "club.doki7.vulkan.datatype.*",
            "club.doki7.vulkan.enumtype.*",
            "club.doki7.vulkan.handle.*"
        )
    )
    val commandsDoc = generateCommandFile(
        registry,
        "GLFW",
        registry.commands.values.sortedBy { it.name },
        commandCodegenOptions,
        null
    )
    File("$packageDir/GLFW.java")
        .writeText(render(commandsDoc))

    for (structure in registry.structures.values) {
        val structureInterfaceDoc = generateStructureInterface(structure, codegenOptions)
        File("$packageDir/datatype/I${structure.name}.java")
            .writeText(render(structureInterfaceDoc))

        val structureDoc = generateStructure(registry, structure, false, codegenOptions)
        File("$packageDir/datatype/${structure.name}.java")
            .writeText(render(structureDoc))
    }
}
