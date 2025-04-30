package cc.design7.babel.drv

import cc.design7.babel.codegen.CodegenOptions
import cc.design7.babel.codegen.generateBitmask
import cc.design7.babel.codegen.generateConstants
import cc.design7.babel.codegen.generateEnumeration
import cc.design7.babel.codegen.generateStructure
import cc.design7.babel.extract.vulkan.extractVulkanRegistry
import cc.design7.babel.registry.Bitmask
import cc.design7.babel.registry.Command
import cc.design7.babel.registry.Constant
import cc.design7.babel.registry.Entity
import cc.design7.babel.registry.Enumeration
import cc.design7.babel.registry.Structure
import cc.design7.babel.util.render
import java.io.File

internal fun vulkanMain() {
    val vulkanRegistry = extractVulkanRegistry()

    val codegenOptions = CodegenOptions(
        packageName = "cc.design7.vulkan",
        extraImport = mutableListOf(),
        constantClassName = "VkConstants",
        refRegistries = emptyList(),
        seeLinkProvider = ::vulkanDocLinkProvider
    )

    val constantsDoc = generateConstants(vulkanRegistry, codegenOptions)
    File("vulkan/src/main/java/cc/design7/vulkan/${codegenOptions.constantClassName}.java")
        .writeText(render(constantsDoc))

    for (bitmask in vulkanRegistry.bitmasks.values) {
        val bitmaskDoc = generateBitmask(vulkanRegistry, bitmask, codegenOptions)
        File("vulkan/src/main/java/cc/design7/vulkan/bitmask/${bitmask.name}.java")
            .writeText(render(bitmaskDoc))
    }

    for (enumeration in vulkanRegistry.enumerations.values) {
        val enumerationDoc = generateEnumeration(vulkanRegistry, enumeration, codegenOptions)
        File("vulkan/src/main/java/cc/design7/vulkan/enumtype/${enumeration.name}.java")
            .writeText(render(enumerationDoc))
    }

    for (structure in vulkanRegistry.structures.values) {
        try {
            generateStructure(vulkanRegistry, structure, codegenOptions)
        } catch (e: Exception) {
            log.severe("Failed to generate structure ${structure.name}: ${e.message}")
        }
    }
}

private fun vulkanDocLinkProvider(entity: Entity) = when(entity) {
    is Constant -> {
        val constantName = entity.name.original
        val typeName = entity.type.ident.value

        if (constantName.startsWith("STD_VIDEO_")) {
            null
        } else if (constantName.endsWith("_EXTENSION_NAME") && typeName == "CONSTANTS_JavaString") {
            val constantValueUnquoted = entity.expr.removePrefix("\"").removeSuffix("\"")
            if (constantValueUnquoted.contains("STD_vulkan_video")) {
                null
            } else {
                "<a href=\"https://registry.khronos.org/vulkan/specs/latest/man/html/$constantValueUnquoted.html\">$constantValueUnquoted</a>"
            }
        } else {
            "<a href=\"https://registry.khronos.org/vulkan/specs/latest/man/html/${entity.name.original}.html\">$constantName</a>"
        }
    }
    is Bitmask, is Command, is Enumeration, is Structure ->
        "<a href=\"https://registry.khronos.org/vulkan/specs/latest/man/html/${entity.name.original}.html\">${entity.name.original}</a>"
    else -> null
}
