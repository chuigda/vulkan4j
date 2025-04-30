package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkFrontFace.html">VkFrontFace</a>
public final class VkFrontFace {
    public static final int COUNTER_CLOCKWISE = 0x0;
    public static final int CLOCKWISE = 0x1;

    public static String explain(@enumtype(VkFrontFace.class) int value) {
        return switch (value) {
            case VkFrontFace.CLOCKWISE -> "VK_FRONT_FACE_CLOCKWISE";
            case VkFrontFace.COUNTER_CLOCKWISE -> "VK_FRONT_FACE_COUNTER_CLOCKWISE";
            default -> "Unknown VkFrontFace: " + value;
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkFrontFace() {}
}
