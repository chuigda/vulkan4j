package tech.icey.vma;

import tech.icey.panama.annotation.nullable;
import tech.icey.vk4j.command.DeviceCommands;
import tech.icey.vk4j.command.EntryCommands;
import tech.icey.vk4j.command.InstanceCommands;
import tech.icey.vk4j.command.StaticCommands;
import tech.icey.vma.datatype.VmaVulkanFunctions;

import java.lang.foreign.MemorySegment;

public final class VMAUtil {
    public static void fillVulkanFunctions(
            VmaVulkanFunctions functions,
            StaticCommands staticCommands,
            EntryCommands entryCommands,
            InstanceCommands instanceCommands,
            DeviceCommands deviceCommands
    ) {
        functions.vkGetInstanceProcAddr(u(staticCommands.SEGMENT$vkGetInstanceProcAddr));
        functions.vkGetDeviceProcAddr(u(staticCommands.SEGMENT$vkGetDeviceProcAddr));
        functions.vkGetPhysicalDeviceProperties(u(instanceCommands.SEGMENT$vkGetPhysicalDeviceProperties));
        functions.vkGetPhysicalDeviceMemoryProperties(u(instanceCommands.SEGMENT$vkGetPhysicalDeviceMemoryProperties));
        functions.vkAllocateMemory(u(deviceCommands.SEGMENT$vkAllocateMemory));
        functions.vkFreeMemory(u(deviceCommands.SEGMENT$vkFreeMemory));
        functions.vkMapMemory(u(deviceCommands.SEGMENT$vkMapMemory));
        functions.vkUnmapMemory(u(deviceCommands.SEGMENT$vkUnmapMemory));
        functions.vkFlushMappedMemoryRanges(u(deviceCommands.SEGMENT$vkFlushMappedMemoryRanges));
        functions.vkInvalidateMappedMemoryRanges(u(deviceCommands.SEGMENT$vkInvalidateMappedMemoryRanges));
        functions.vkBindBufferMemory(u(deviceCommands.SEGMENT$vkBindBufferMemory));
        functions.vkBindImageMemory(u(deviceCommands.SEGMENT$vkBindImageMemory));
        functions.vkGetBufferMemoryRequirements(u(deviceCommands.SEGMENT$vkGetBufferMemoryRequirements));
        functions.vkGetImageMemoryRequirements(u(deviceCommands.SEGMENT$vkGetImageMemoryRequirements));
        functions.vkCreateBuffer(u(deviceCommands.SEGMENT$vkCreateBuffer));
        functions.vkDestroyBuffer(u(deviceCommands.SEGMENT$vkDestroyBuffer));
        functions.vkCreateImage(u(deviceCommands.SEGMENT$vkCreateImage));
        functions.vkDestroyImage(u(deviceCommands.SEGMENT$vkDestroyImage));
        functions.vkCmdCopyBuffer(u(deviceCommands.SEGMENT$vkCmdCopyBuffer));

        // Vulkan 1.1 or VK_KHR_dedicated_allocation
        functions.vkGetBufferMemoryRequirements2KHR(u(deviceCommands.SEGMENT$vkGetBufferMemoryRequirements2));
        functions.vkGetImageMemoryRequirements2KHR(u(deviceCommands.SEGMENT$vkGetImageMemoryRequirements2));

        // Vulkan 1.1 or VK_KHR_bind_memory2
        functions.vkBindBufferMemory2KHR(u(deviceCommands.SEGMENT$vkBindBufferMemory2));
        functions.vkBindImageMemory2KHR(u(deviceCommands.SEGMENT$vkBindImageMemory2));

        // Vulkan 1.1 or VK_EXT_memory_budget
        functions.vkGetPhysicalDeviceMemoryProperties2KHR(u(instanceCommands.SEGMENT$vkGetPhysicalDeviceMemoryProperties2));

        // Vulkan 1.3 or VK_KHR_maintenance4
        functions.vkGetBufferMemoryRequirements2KHR(u(deviceCommands.SEGMENT$vkGetBufferMemoryRequirements2));
        functions.vkGetImageMemoryRequirements2KHR(u(deviceCommands.SEGMENT$vkGetImageMemoryRequirements2));
    }

    private static MemorySegment u(@nullable MemorySegment segment) {
        if (segment == null) {
            return MemorySegment.NULL;
        }
        return segment;
    }
}
