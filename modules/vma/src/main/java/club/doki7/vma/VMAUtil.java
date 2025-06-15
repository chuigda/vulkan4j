package club.doki7.vma;

import club.doki7.vma.datatype.VmaVulkanFunctions;
import org.jetbrains.annotations.Nullable;

import java.lang.foreign.MemorySegment;

public final class VMAUtil {
    public static void fillVulkanFunctions(
            VmaVulkanFunctions functions,
            VkStaticCommands staticCommands,
            VkEntryCommands entryCommands,
            VkInstanceCommands instanceCommands,
            VkDeviceCommands deviceCommands
    ) {
        functions.getInstanceProcAddr(u(staticCommands.SEGMENT$vkGetInstanceProcAddr));
        functions.getDeviceProcAddr(u(staticCommands.SEGMENT$vkGetDeviceProcAddr));
        functions.getPhysicalDeviceProperties(u(instanceCommands.SEGMENT$vkGetPhysicalDeviceProperties));
        functions.getPhysicalDeviceMemoryProperties(u(instanceCommands.SEGMENT$vkGetPhysicalDeviceMemoryProperties));
        functions.allocateMemory(u(deviceCommands.SEGMENT$vkAllocateMemory));
        functions.freeMemory(u(deviceCommands.SEGMENT$vkFreeMemory));
        functions.mapMemory(u(deviceCommands.SEGMENT$vkMapMemory));
        functions.unmapMemory(u(deviceCommands.SEGMENT$vkUnmapMemory));
        functions.flushMappedMemoryRanges(u(deviceCommands.SEGMENT$vkFlushMappedMemoryRanges));
        functions.invalidateMappedMemoryRanges(u(deviceCommands.SEGMENT$vkInvalidateMappedMemoryRanges));
        functions.bindBufferMemory(u(deviceCommands.SEGMENT$vkBindBufferMemory));
        functions.bindImageMemory(u(deviceCommands.SEGMENT$vkBindImageMemory));
        functions.getBufferMemoryRequirements(u(deviceCommands.SEGMENT$vkGetBufferMemoryRequirements));
        functions.getImageMemoryRequirements(u(deviceCommands.SEGMENT$vkGetImageMemoryRequirements));
        functions.createBuffer(u(deviceCommands.SEGMENT$vkCreateBuffer));
        functions.destroyBuffer(u(deviceCommands.SEGMENT$vkDestroyBuffer));
        functions.createImage(u(deviceCommands.SEGMENT$vkCreateImage));
        functions.destroyImage(u(deviceCommands.SEGMENT$vkDestroyImage));
        functions.cmdCopyBuffer(u(deviceCommands.SEGMENT$vkCmdCopyBuffer));

        // Vulkan 1.1 or VK_KHR_dedicated_allocation
        functions.getBufferMemoryRequirements2KHR(u(
                deviceCommands.SEGMENT$vkGetBufferMemoryRequirements2,
                deviceCommands.SEGMENT$vkGetBufferMemoryRequirements2KHR
        ));
        functions.getImageMemoryRequirements2KHR(u(
                deviceCommands.SEGMENT$vkGetImageMemoryRequirements2,
                deviceCommands.SEGMENT$vkGetImageMemoryRequirements2KHR
        ));

        // Vulkan 1.1 or VK_KHR_bind_memory2
        functions.bindBufferMemory2KHR(u(
                deviceCommands.SEGMENT$vkBindBufferMemory2,
                deviceCommands.SEGMENT$vkBindBufferMemory2KHR
        ));
        functions.bindImageMemory2KHR(u(
                deviceCommands.SEGMENT$vkBindImageMemory2,
                deviceCommands.SEGMENT$vkBindImageMemory2KHR
        ));

        // Vulkan 1.1 or VK_EXT_memory_budget
        functions.getPhysicalDeviceMemoryProperties2KHR(u(
                instanceCommands.SEGMENT$vkGetPhysicalDeviceMemoryProperties2,
                instanceCommands.SEGMENT$vkGetPhysicalDeviceMemoryProperties2KHR
        ));

        // Vulkan 1.3 or VK_KHR_maintenance4
        functions.getBufferMemoryRequirements2KHR(u(
                deviceCommands.SEGMENT$vkGetBufferMemoryRequirements2,
                deviceCommands.SEGMENT$vkGetBufferMemoryRequirements2KHR
        ));
        functions.getImageMemoryRequirements2KHR(u(
                deviceCommands.SEGMENT$vkGetImageMemoryRequirements2,
                deviceCommands.SEGMENT$vkGetImageMemoryRequirements2KHR
        ));

        // VK_KHR_external_memory_win32
        functions.getMemoryWin32HandleKHR(u(deviceCommands.SEGMENT$vkGetMemoryWin32HandleKHR));
    }

    private static MemorySegment u(@Nullable MemorySegment ...segments) {
        for (MemorySegment segment : segments) {
            if (segment != null && !segment.equals(MemorySegment.NULL)) {
                return segment;
            }
        }
        return MemorySegment.NULL;
    }
}
