package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDebugUtilsMessageTypeFlagsEXT.html">VkDebugUtilsMessageTypeFlagsEXT</a>
public final class VkDebugUtilsMessageTypeFlagsEXT {
    public static final int DEBUG_UTILS_MESSAGE_TYPE_DEVICE_ADDRESS_BINDING = 0x8;
    public static final int DEBUG_UTILS_MESSAGE_TYPE_GENERAL = 0x1;
    public static final int DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE = 0x4;
    public static final int DEBUG_UTILS_MESSAGE_TYPE_VALIDATION = 0x2;

    public static String explain(@enumtype(VkDebugUtilsMessageTypeFlagsEXT.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & DEBUG_UTILS_MESSAGE_TYPE_DEVICE_ADDRESS_BINDING) != 0) {
            detectedFlagBits.add("VK_DEBUG_UTILS_MESSAGE_TYPE_DEVICE_ADDRESS_BINDING_BIT_EXT");
        }
        if ((flags & DEBUG_UTILS_MESSAGE_TYPE_GENERAL) != 0) {
            detectedFlagBits.add("VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT");
        }
        if ((flags & DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE) != 0) {
            detectedFlagBits.add("VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT");
        }
        if ((flags & DEBUG_UTILS_MESSAGE_TYPE_VALIDATION) != 0) {
            detectedFlagBits.add("VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkDebugUtilsMessageTypeFlagsEXT() {}
}
