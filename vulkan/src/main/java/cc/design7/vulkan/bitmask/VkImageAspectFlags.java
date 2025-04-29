package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageAspectFlags.html">VkImageAspectFlags</a>
public final class VkImageAspectFlags {
    public static final int IMAGE_ASPECT_COLOR = 0x1;
    public static final int IMAGE_ASPECT_DEPTH = 0x2;
    public static final int IMAGE_ASPECT_MEMORY_PLANE_0_EXT = 0x80;
    public static final int IMAGE_ASPECT_MEMORY_PLANE_1_EXT = 0x100;
    public static final int IMAGE_ASPECT_MEMORY_PLANE_2_EXT = 0x200;
    public static final int IMAGE_ASPECT_MEMORY_PLANE_3_EXT = 0x400;
    public static final int IMAGE_ASPECT_METADATA = 0x8;
    public static final int IMAGE_ASPECT_PLANE_0 = 0x10;
    public static final int IMAGE_ASPECT_PLANE_1 = 0x20;
    public static final int IMAGE_ASPECT_PLANE_2 = 0x40;
    public static final int IMAGE_ASPECT_STENCIL = 0x4;

    public static String explain(@enumtype(VkImageAspectFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & IMAGE_ASPECT_COLOR) != 0) {
            detectedFlagBits.add("VK_IMAGE_ASPECT_COLOR_BIT");
        }
        if ((flags & IMAGE_ASPECT_DEPTH) != 0) {
            detectedFlagBits.add("VK_IMAGE_ASPECT_DEPTH_BIT");
        }
        if ((flags & IMAGE_ASPECT_MEMORY_PLANE_0_EXT) != 0) {
            detectedFlagBits.add("VK_IMAGE_ASPECT_MEMORY_PLANE_0_BIT_EXT");
        }
        if ((flags & IMAGE_ASPECT_MEMORY_PLANE_1_EXT) != 0) {
            detectedFlagBits.add("VK_IMAGE_ASPECT_MEMORY_PLANE_1_BIT_EXT");
        }
        if ((flags & IMAGE_ASPECT_MEMORY_PLANE_2_EXT) != 0) {
            detectedFlagBits.add("VK_IMAGE_ASPECT_MEMORY_PLANE_2_BIT_EXT");
        }
        if ((flags & IMAGE_ASPECT_MEMORY_PLANE_3_EXT) != 0) {
            detectedFlagBits.add("VK_IMAGE_ASPECT_MEMORY_PLANE_3_BIT_EXT");
        }
        if ((flags & IMAGE_ASPECT_METADATA) != 0) {
            detectedFlagBits.add("VK_IMAGE_ASPECT_METADATA_BIT");
        }
        if ((flags & IMAGE_ASPECT_PLANE_0) != 0) {
            detectedFlagBits.add("VK_IMAGE_ASPECT_PLANE_0_BIT");
        }
        if ((flags & IMAGE_ASPECT_PLANE_1) != 0) {
            detectedFlagBits.add("VK_IMAGE_ASPECT_PLANE_1_BIT");
        }
        if ((flags & IMAGE_ASPECT_PLANE_2) != 0) {
            detectedFlagBits.add("VK_IMAGE_ASPECT_PLANE_2_BIT");
        }
        if ((flags & IMAGE_ASPECT_STENCIL) != 0) {
            detectedFlagBits.add("VK_IMAGE_ASPECT_STENCIL_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkImageAspectFlags() {}
}
