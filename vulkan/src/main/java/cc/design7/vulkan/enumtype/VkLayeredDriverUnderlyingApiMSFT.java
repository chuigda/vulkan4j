package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkLayeredDriverUnderlyingApiMSFT.html">VkLayeredDriverUnderlyingApiMSFT</a>
public final class VkLayeredDriverUnderlyingApiMSFT {
    public static final int NONE = 0x0;
    public static final int D3D12 = 0x1;

    public static String explain(@enumtype(VkLayeredDriverUnderlyingApiMSFT.class) int value) {
        return switch (value) {
            case VkLayeredDriverUnderlyingApiMSFT.D3D12 -> "VK_LAYERED_DRIVER_UNDERLYING_API_D3D12_MSFT";
            case VkLayeredDriverUnderlyingApiMSFT.NONE -> "VK_LAYERED_DRIVER_UNDERLYING_API_NONE_MSFT";
            default -> "Unknown VkLayeredDriverUnderlyingApiMSFT: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkLayeredDriverUnderlyingApiMSFT() {}
}
