package club.doki7.vulkan.bitmask;

import club.doki7.ffm.annotation.*;
import org.intellij.lang.annotations.MagicConstant;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSwapchainCreateFlagsKHR.html"><code>VkSwapchainCreateFlagsKHR</code></a>
public final class VkSwapchainCreateFlagsKHR {
    public static final int DEFERRED_MEMORY_ALLOCATION_EXT = 0x8;
    public static final int MUTABLE_FORMAT = 0x4;
    public static final int PROTECTED = 0x2;
    public static final int SPLIT_INSTANCE_BIND_REGIONS = 0x1;

    public static String explain(@MagicConstant(flagsFromClass = VkSwapchainCreateFlagsKHR.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & DEFERRED_MEMORY_ALLOCATION_EXT) != 0) {
            detectedFlagBits.add("VK_SWAPCHAIN_CREATE_DEFERRED_MEMORY_ALLOCATION_BIT_EXT");
        }
        if ((flags & MUTABLE_FORMAT) != 0) {
            detectedFlagBits.add("VK_SWAPCHAIN_CREATE_MUTABLE_FORMAT_BIT_KHR");
        }
        if ((flags & PROTECTED) != 0) {
            detectedFlagBits.add("VK_SWAPCHAIN_CREATE_PROTECTED_BIT_KHR");
        }
        if ((flags & SPLIT_INSTANCE_BIND_REGIONS) != 0) {
            detectedFlagBits.add("VK_SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkSwapchainCreateFlagsKHR() {}
}
