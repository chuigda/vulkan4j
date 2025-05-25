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
import club.doki7.babel.registry.EmptyMergeable
import club.doki7.babel.registry.FunctionTypedef
import club.doki7.babel.registry.Identifier
import club.doki7.babel.registry.Registry
import club.doki7.babel.registry.RegistryBase
import club.doki7.babel.registry.intern
import club.doki7.babel.util.Either
import club.doki7.babel.util.render
import java.io.File

private const val packageDir = "vma/src/main/java/club/doki7/vma"

fun vmaMain(vulkanRegistry: RegistryBase) {
    val registry = extractVMAHeader()

    val additionalFunctionTypedefs = mutableMapOf<Identifier, FunctionTypedef>()
    fun pfn(s: String) {
        val name = s.intern()
        additionalFunctionTypedefs[name] = FunctionTypedef(name, emptyList(), null)
    }
    pfn("PFN_vkGetInstanceProcAddr")
    pfn("PFN_vkGetDeviceProcAddr")
    pfn("PFN_vkGetPhysicalDeviceProperties")
    pfn("PFN_vkGetPhysicalDeviceMemoryProperties")
    pfn("PFN_vkAllocateMemory")
    pfn("PFN_vkFreeMemory")
    pfn("PFN_vkMapMemory")
    pfn("PFN_vkUnmapMemory")
    pfn("PFN_vkFlushMappedMemoryRanges")
    pfn("PFN_vkInvalidateMappedMemoryRanges")
    pfn("PFN_vkBindBufferMemory")
    pfn("PFN_vkBindImageMemory")
    pfn("PFN_vkGetBufferMemoryRequirements")
    pfn("PFN_vkGetImageMemoryRequirements")
    pfn("PFN_vkCreateBuffer")
    pfn("PFN_vkDestroyBuffer")
    pfn("PFN_vkCreateImage")
    pfn("PFN_vkDestroyImage")
    pfn("PFN_vkCmdCopyBuffer")
    pfn("PFN_vkGetBufferMemoryRequirements2KHR")
    pfn("PFN_vkGetImageMemoryRequirements2KHR")
    pfn("PFN_vkBindBufferMemory2KHR")
    pfn("PFN_vkBindImageMemory2KHR")
    pfn("PFN_vkGetPhysicalDeviceMemoryProperties2KHR")
    pfn("PFN_vkGetDeviceBufferMemoryRequirementsKHR")
    pfn("PFN_vkGetDeviceImageMemoryRequirementsKHR")
    pfn("PFN_vkGetMemoryWin32HandleKHR")

    val vulkanPFNRegistry = Registry(
        aliases = mutableMapOf(),
        bitmasks = mutableMapOf(),
        constants = mutableMapOf(),
        commands = mutableMapOf(),
        enumerations = mutableMapOf(),
        functionTypedefs = additionalFunctionTypedefs,
        opaqueHandleTypedefs = mutableMapOf(),
        opaqueTypedefs = mutableMapOf(),
        structures = mutableMapOf(),
        unions = mutableMapOf(),
        ext = EmptyMergeable()
    )

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
        refRegistries = listOf(vulkanRegistry, vulkanPFNRegistry),
    )

    val functionTypeDoc = generateFunctionTypedefs(registry, codegenOptions)
    File("$packageDir/${codegenOptions.functionTypeClassName}.java")
        .writeText(render(functionTypeDoc))

    val bitmaskAndEnumCodegenOptions = codegenOptions.copy(extraImport = emptyList())
    for (bitmask in registry.bitmasks.values) {
        if (bitmask.name.original == "VmaVirtualAllocationCreateFlags") {
            continue
        }

        val bitmaskDoc = generateBitmask(bitmask, bitmaskAndEnumCodegenOptions)
        File("$packageDir/bitmask/${bitmask.name}.java")
            .writeText(render(bitmaskDoc))
    }

    do {
        val bitmask = registry.bitmasks["VmaVirtualAllocationCreateFlags".intern()]!!
        bitmask.bitflags.forEach {
            if (it.value is Either.Right) {
                for ((idx, value) in it.value.value.withIndex()) {
                    it.value.value[idx] = "VmaAllocationCreateFlags." +
                            value.removePrefix("VMA_ALLOCATION_CREATE_")
                }
            }
        }
        val bitmaskDoc = generateBitmask(bitmask, bitmaskAndEnumCodegenOptions)
        File("$packageDir/bitmask/VmaVirtualAllocationCreateFlags.java")
            .writeText(render(bitmaskDoc))
    } while (false)

    for (enumeration in registry.enumerations.values) {
        val enumerationDoc = generateEnumeration(registry, enumeration, bitmaskAndEnumCodegenOptions)
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
        val structureInterfaceDoc = generateStructureInterface(structure, codegenOptions)
        File("$packageDir/datatype/I${structure.name}.java")
            .writeText(render(structureInterfaceDoc))

        val structureDoc = generateStructure(registry, structure, false, structureCodegenOptions)
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
