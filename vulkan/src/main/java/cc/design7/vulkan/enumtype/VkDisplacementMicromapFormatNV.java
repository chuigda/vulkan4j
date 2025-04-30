package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDisplacementMicromapFormatNV.html">VkDisplacementMicromapFormatNV</a>
public final class VkDisplacementMicromapFormatNV {
    public static final int _64_TRIANGLES_64_BYTES = 0x1;
    public static final int _256_TRIANGLES_128_BYTES = 0x2;
    public static final int _1024_TRIANGLES_128_BYTES = 0x3;

    public static String explain(@enumtype(VkDisplacementMicromapFormatNV.class) int value) {
        return switch (value) {
            case VkDisplacementMicromapFormatNV._1024_TRIANGLES_128_BYTES -> "VK_DISPLACEMENT_MICROMAP_FORMAT_1024_TRIANGLES_128_BYTES_NV";
            case VkDisplacementMicromapFormatNV._256_TRIANGLES_128_BYTES -> "VK_DISPLACEMENT_MICROMAP_FORMAT_256_TRIANGLES_128_BYTES_NV";
            case VkDisplacementMicromapFormatNV._64_TRIANGLES_64_BYTES -> "VK_DISPLACEMENT_MICROMAP_FORMAT_64_TRIANGLES_64_BYTES_NV";
            default -> "Unknown VkDisplacementMicromapFormatNV: " + value;
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkDisplacementMicromapFormatNV() {}
}
