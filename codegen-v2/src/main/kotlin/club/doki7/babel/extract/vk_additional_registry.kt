package club.doki7.babel.extract

import club.doki7.babel.registry.EmptyMergeable
import club.doki7.babel.registry.FunctionTypedef
import club.doki7.babel.registry.Identifier
import club.doki7.babel.registry.IdentifierType
import club.doki7.babel.registry.OpaqueTypedef
import club.doki7.babel.registry.PointerType
import club.doki7.babel.registry.Registry
import club.doki7.babel.registry.Typedef
import club.doki7.babel.registry.intern
import club.doki7.babel.registry.putEntityIfAbsent

fun vulkanAdditionalRegistry(): Registry<EmptyMergeable> {
    val additionalTypedefs = mutableMapOf<Identifier, Typedef>()

    additionalTypedefs.putEntityIfAbsent(Typedef("VkResult", "uint32_t"))

    fun pvoid(s: String) {
        additionalTypedefs.putEntityIfAbsent(Typedef(s, PointerType(IdentifierType("void"))))
    }

    pvoid("VkInstance")
    pvoid("VkDevice")
    pvoid("VkSurfaceKHR")
    pvoid("VkPhysicalDevice")

    val additionalOpaqueTypedefs = mutableMapOf<Identifier, OpaqueTypedef>()

    fun opaque(s: String) {
        additionalOpaqueTypedefs.putEntityIfAbsent(OpaqueTypedef(s))
    }

    opaque("VkAllocationCallbacks");

    val additionalFunctionTypedefs = mutableMapOf<Identifier, FunctionTypedef>()

    fun pfn(s: String) {
        additionalFunctionTypedefs.putEntityIfAbsent(FunctionTypedef(
            s,
            emptyList(),
            IdentifierType("void".intern())
        ))
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

    return Registry(
        aliases = additionalTypedefs,
        bitmasks = mutableMapOf(),
        constants = mutableMapOf(),
        commands = mutableMapOf(),
        enumerations = mutableMapOf(),
        functionTypedefs = additionalFunctionTypedefs,
        opaqueHandleTypedefs = mutableMapOf(),
        opaqueTypedefs = additionalOpaqueTypedefs,
        structures = mutableMapOf(),
        unions = mutableMapOf(),
        ext = EmptyMergeable()
    )
}
