package club.doki7.babel.drv

import club.doki7.babel.codegen.CodegenOptions
import club.doki7.babel.codegen.generateBitmask
import club.doki7.babel.codegen.generateCommandFile
import club.doki7.babel.codegen.generateConstants
import club.doki7.babel.codegen.generateEnumeration
import club.doki7.babel.codegen.generateFunctionTypedefs
import club.doki7.babel.codegen.generateHandle
import club.doki7.babel.codegen.generateStructure
import club.doki7.babel.extract.vulkan.VulkanRegistryExt
import club.doki7.babel.extract.vulkan.extractVulkanRegistry
import club.doki7.babel.registry.Bitmask
import club.doki7.babel.registry.Command
import club.doki7.babel.registry.Constant
import club.doki7.babel.registry.Entity
import club.doki7.babel.registry.Enumeration
import club.doki7.babel.registry.FunctionTypedef
import club.doki7.babel.registry.IdentifierType
import club.doki7.babel.registry.OpaqueHandleTypedef
import club.doki7.babel.registry.Registry
import club.doki7.babel.registry.Structure
import club.doki7.babel.util.render
import java.io.File

private const val packageDir = "vulkan/src/main/java/club/doki7/vulkan"

internal fun vulkanMain() {
    val vulkanRegistry = extractVulkanRegistry()

    val codegenOptions = CodegenOptions(
        packageName = "club.doki7.vulkan",
        extraImport = mutableListOf(),
        constantClassName = "VkConstants",
        functionTypeClassName = "VkFunctionTypes",
        refRegistries = emptyList(),
        seeLinkProvider = ::vulkanDocLinkProvider
    )

    val constantsDoc = generateConstants(vulkanRegistry, codegenOptions)
    File("$packageDir/${codegenOptions.constantClassName}.java")
        .writeText(render(constantsDoc))

    val functionTypeDoc = generateFunctionTypedefs(vulkanRegistry, codegenOptions)
    File("$packageDir/${codegenOptions.functionTypeClassName}.java")
        .writeText(render(functionTypeDoc))

    for (bitmask in vulkanRegistry.bitmasks.values) {
        val bitmaskDoc = generateBitmask(vulkanRegistry, bitmask, codegenOptions)
        File("$packageDir/bitmask/${bitmask.name}.java")
            .writeText(render(bitmaskDoc))
    }

    for (enumeration in vulkanRegistry.enumerations.values) {
        val enumerationDoc = generateEnumeration(vulkanRegistry, enumeration, codegenOptions)
        File("$packageDir/enumtype/${enumeration.name}.java")
            .writeText(render(enumerationDoc))
    }

    for (structure in vulkanRegistry.structures.values) {
        try {
            val structureDoc = generateStructure(vulkanRegistry, structure, false, codegenOptions)
            File("$packageDir/datatype/${structure.name}.java")
                .writeText(render(structureDoc))
        } catch (e: Throwable) {
            e.printStackTrace()
            log.severe("Failed to generate structure ${structure.name}: ${e.message}")
        }
    }

    for (unions in vulkanRegistry.unions.values) {
        try {
            val structureDoc = generateStructure(vulkanRegistry, unions, true, codegenOptions)
            File("$packageDir/datatype/${unions.name}.java")
                .writeText(render(structureDoc))
        } catch (e: Throwable) {
            e.printStackTrace()
            log.severe("Failed to generate union ${unions.name}: ${e.message}")
        }
    }

    for (handle in vulkanRegistry.opaqueHandleTypedefs.values) {
        val handleDoc = generateHandle(vulkanRegistry, handle, codegenOptions)
        File("$packageDir/handle/${handle.name}.java")
            .writeText(render(handleDoc))
    }

    initExtensionCommandTypes(vulkanRegistry)
    val staticCommands = mutableListOf<Command>()
    val entryCommands = mutableListOf<Command>()
    val instanceCommands = mutableListOf<Command>()
    val deviceCommands = mutableListOf<Command>()
    vulkanRegistry.commands.values.sortedBy { it.name }.forEach {
        when (detectCommandType(it)) {
            CommandType.STATIC -> staticCommands.add(it)
            CommandType.ENTRY -> entryCommands.add(it)
            CommandType.INSTANCE -> instanceCommands.add(it)
            CommandType.DEVICE -> deviceCommands.add(it)
        }
    }

    val staticCommandsDoc = generateCommandFile(
        vulkanRegistry,
        "VkStaticCommands",
        staticCommands,
        codegenOptions,
        null
    )
    val entryCommandsDoc = generateCommandFile(
        vulkanRegistry,
        "VkEntryCommands",
        entryCommands,
        codegenOptions,
        null
    )
    val instanceCommandsDoc = generateCommandFile(
        vulkanRegistry,
        "VkInstanceCommands",
        instanceCommands,
        codegenOptions,
        null
    )
    val deviceCommandsDoc = generateCommandFile(
        vulkanRegistry,
        "VkDeviceCommands",
        deviceCommands,
        codegenOptions,
        null
    )

    File("$packageDir/command/VkStaticCommands.java")
        .writeText(render(staticCommandsDoc))
    File("$packageDir/command/VkEntryCommands.java")
        .writeText(render(entryCommandsDoc))
    File("$packageDir/command/VkInstanceCommands.java")
        .writeText(render(instanceCommandsDoc))
    File("$packageDir/command/VkDeviceCommands.java")
        .writeText(render(deviceCommandsDoc))
}

private enum class CommandType {
    STATIC,
    ENTRY,
    INSTANCE,
    DEVICE
}

private val knownStaticCommands = setOf(
    "vkGetInstanceProcAddr",
    "vkGetDeviceProcAddr"
)
private val knownEntryCommands = setOf(
    "vkCreateInstance",
    "vkEnumerateInstanceExtensionProperties",
    "vkEnumerateInstanceLayerProperties",
    "vkEnumerateInstanceVersion",
)
private val knownInstanceCommands = setOf("vkCreateInstance")

private val extensionCommandTypes = mutableMapOf<String, CommandType?>()

private fun initExtensionCommandTypes(registry: Registry<VulkanRegistryExt>) {
    for (extension in registry.ext.extensions.values) {
        val commandType = when (extension.type) {
            "static" -> CommandType.STATIC
            "entry" -> CommandType.ENTRY
            "instance" -> CommandType.INSTANCE
            "device" -> CommandType.DEVICE
            else -> continue
        }

        for (command in extension.require.commands) {
            if (command.original in extensionCommandTypes) {
                if (extensionCommandTypes[command.original] != commandType) {
                    log.warning("duplicate/conflicting command type for ${command.original} in ${extension.name}")
                }
            } else {
                extensionCommandTypes[command.original] = commandType
            }
        }
    }
}

private val deviceLevelCommandFirstParamTypes = setOf(
    "VkCommandBuffer",
    "VkDevice",
    "VkQueue"
)

private fun detectCommandType(command: Command): CommandType {
    if (command.name.original in knownStaticCommands) {
        return CommandType.STATIC
    }

    if (command.name.original in knownEntryCommands) {
        return CommandType.ENTRY
    }

    if (command.name.original in knownInstanceCommands) {
        return CommandType.INSTANCE
    }

    if (command.name.original in extensionCommandTypes) {
        return extensionCommandTypes[command.name.original]!!
    }

    if (command.params.isNotEmpty()) {
        val firstParamType = command.params[0].type
        if (firstParamType is IdentifierType
            && firstParamType.ident.original in deviceLevelCommandFirstParamTypes) {
            return CommandType.DEVICE
        }
    }
    return CommandType.INSTANCE
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
