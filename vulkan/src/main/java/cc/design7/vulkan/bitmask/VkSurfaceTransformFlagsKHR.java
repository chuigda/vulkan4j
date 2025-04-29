package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSurfaceTransformFlagsKHR.html">VkSurfaceTransformFlagsKHR</a>
public final class VkSurfaceTransformFlagsKHR {
    public static final int SURFACE_TRANSFORM_HORIZONTAL_MIRROR = 0x10;
    public static final int SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180 = 0x40;
    public static final int SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270 = 0x80;
    public static final int SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90 = 0x20;
    public static final int SURFACE_TRANSFORM_IDENTITY = 0x1;
    public static final int SURFACE_TRANSFORM_INHERIT = 0x100;
    public static final int SURFACE_TRANSFORM_ROTATE_180 = 0x4;
    public static final int SURFACE_TRANSFORM_ROTATE_270 = 0x8;
    public static final int SURFACE_TRANSFORM_ROTATE_90 = 0x2;

    public static String explain(@enumtype(VkSurfaceTransformFlagsKHR.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & SURFACE_TRANSFORM_HORIZONTAL_MIRROR) != 0) {
            detectedFlagBits.add("VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR");
        }
        if ((flags & SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180) != 0) {
            detectedFlagBits.add("VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR");
        }
        if ((flags & SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270) != 0) {
            detectedFlagBits.add("VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR");
        }
        if ((flags & SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90) != 0) {
            detectedFlagBits.add("VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR");
        }
        if ((flags & SURFACE_TRANSFORM_IDENTITY) != 0) {
            detectedFlagBits.add("VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR");
        }
        if ((flags & SURFACE_TRANSFORM_INHERIT) != 0) {
            detectedFlagBits.add("VK_SURFACE_TRANSFORM_INHERIT_BIT_KHR");
        }
        if ((flags & SURFACE_TRANSFORM_ROTATE_180) != 0) {
            detectedFlagBits.add("VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR");
        }
        if ((flags & SURFACE_TRANSFORM_ROTATE_270) != 0) {
            detectedFlagBits.add("VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR");
        }
        if ((flags & SURFACE_TRANSFORM_ROTATE_90) != 0) {
            detectedFlagBits.add("VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkSurfaceTransformFlagsKHR() {}
}
