package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkLayeredDriverUnderlyingApiMSFT {
    public static final int VK_LAYERED_DRIVER_UNDERLYING_API_NONE_MSFT = 0;
    public static final int VK_LAYERED_DRIVER_UNDERLYING_API_D3D12_MSFT = 1;

    public static String explain(@enumtype(VkLayeredDriverUnderlyingApiMSFT.class) int value) {
        return switch (value) {
            case VK_LAYERED_DRIVER_UNDERLYING_API_NONE_MSFT -> "VK_LAYERED_DRIVER_UNDERLYING_API_NONE_MSFT";
            case VK_LAYERED_DRIVER_UNDERLYING_API_D3D12_MSFT -> "VK_LAYERED_DRIVER_UNDERLYING_API_D3D12_MSFT";
            default -> "Unknown";
        };
    }
}
