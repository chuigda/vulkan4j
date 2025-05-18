package club.doki7.babel.drv

import club.doki7.babel.codegen.CodegenOptions
import club.doki7.babel.codegen.generateBitmask
import club.doki7.babel.codegen.generateConstants
import club.doki7.babel.codegen.generateEnumeration
import club.doki7.babel.codegen.generateFunctionTypedefs
import club.doki7.babel.codegen.generateHandle
import club.doki7.babel.codegen.generateStructure
import club.doki7.babel.extract.vulkan.extractVulkanRegistry
import club.doki7.babel.registry.Bitmask
import club.doki7.babel.registry.Command
import club.doki7.babel.registry.Constant
import club.doki7.babel.registry.Entity
import club.doki7.babel.registry.Enumeration
import club.doki7.babel.registry.FunctionTypedef
import club.doki7.babel.registry.OpaqueHandleTypedef
import club.doki7.babel.registry.Structure
import club.doki7.babel.util.render
import java.io.File

internal fun vulkanMain() {
    val vulkanRegistry = extractVulkanRegistry()

    val codegenOptions = CodegenOptions(
        packageName = "club.doki7.vulkan",
        extraImport = mutableListOf(),
        constantClassName = "VkConstants",
        functionClassName = "Vulkan",
        functionTypeClassName = "VkFunctionTypes",
        refRegistries = emptyList(),
        seeLinkProvider = ::vulkanDocLinkProvider
    )

    val constantsDoc = generateConstants(vulkanRegistry, codegenOptions)
    File("vulkan/src/main/java/club/doki7/vulkan/${codegenOptions.constantClassName}.java")
        .writeText(render(constantsDoc))

    val functionTypeDoc = generateFunctionTypedefs(vulkanRegistry, codegenOptions)
    File("vulkan/src/main/java/club/doki7/vulkan/${codegenOptions.functionTypeClassName}.java")
        .writeText(render(functionTypeDoc))

    for (bitmask in vulkanRegistry.bitmasks.values) {
        val bitmaskDoc = generateBitmask(vulkanRegistry, bitmask, codegenOptions)
        File("vulkan/src/main/java/club/doki7/vulkan/bitmask/${bitmask.name}.java")
            .writeText(render(bitmaskDoc))
    }

    for (enumeration in vulkanRegistry.enumerations.values) {
        val enumerationDoc = generateEnumeration(vulkanRegistry, enumeration, codegenOptions)
        File("vulkan/src/main/java/club/doki7/vulkan/enumtype/${enumeration.name}.java")
            .writeText(render(enumerationDoc))
    }

    for (structure in vulkanRegistry.structures.values) {
        try {
            val structureDoc = generateStructure(vulkanRegistry, structure, false, codegenOptions)
            File("vulkan/src/main/java/club/doki7/vulkan/datatype/${structure.name}.java")
                .writeText(render(structureDoc))
        } catch (e: Throwable) {
            e.printStackTrace()
            log.severe("Failed to generate structure ${structure.name}: ${e.message}")
        }
    }

    for (unions in vulkanRegistry.unions.values) {
        try {
            val structureDoc = generateStructure(vulkanRegistry, unions, true, codegenOptions)
            File("vulkan/src/main/java/club/doki7/vulkan/datatype/${unions.name}.java")
                .writeText(render(structureDoc))
        } catch (e: Throwable) {
            e.printStackTrace()
            log.severe("Failed to generate union ${unions.name}: ${e.message}")
        }
    }

    for (handle in vulkanRegistry.opaqueHandleTypedefs.values) {
        val handleDoc = generateHandle(vulkanRegistry, handle, codegenOptions)
        File("vulkan/src/main/java/club/doki7/vulkan/handle/${handle.name}.java")
            .writeText(render(handleDoc))
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
                "<a href=\"https://registry.khronos.org/vulkan/specs/latest/man/html/$constantValueUnquoted.html\"><code>$constantValueUnquoted</code></a>"
            }
        } else {
            "<a href=\"https://registry.khronos.org/vulkan/specs/latest/man/html/${entity.name.original}.html\"><code>$constantName</code></a>"
        }
    }
    is Bitmask, is Command, is Enumeration, is Structure, is OpaqueHandleTypedef, is FunctionTypedef -> {
        val entityName = entity.name.original
        if (entityName.startsWith("StdVideo") || entityName.startsWith("Nv")) {
            null
        } else {
            "<a href=\"https://registry.khronos.org/vulkan/specs/latest/man/html/${entity.name.original}.html\"><code>${entity.name.original}</code></a>"
        }
    }
    else -> null
}
