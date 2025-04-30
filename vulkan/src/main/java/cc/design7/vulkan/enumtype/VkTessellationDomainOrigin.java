package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkTessellationDomainOrigin.html">VkTessellationDomainOrigin</a>
public final class VkTessellationDomainOrigin {
    public static final int UPPER_LEFT = 0x0;
    public static final int LOWER_LEFT = 0x1;

    public static String explain(@enumtype(VkTessellationDomainOrigin.class) int value) {
        return switch (value) {
            case VkTessellationDomainOrigin.LOWER_LEFT -> "VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT";
            case VkTessellationDomainOrigin.UPPER_LEFT -> "VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT";
            default -> "Unknown VkTessellationDomainOrigin: " + value;
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkTessellationDomainOrigin() {}
}
