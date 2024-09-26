package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkDeviceFaultVendorBinaryHeaderVersionEXT {
    public static final int VK_DEVICE_FAULT_VENDOR_BINARY_HEADER_VERSION_ONE_EXT = 1;

    public static String explain(@enumtype(VkDeviceFaultVendorBinaryHeaderVersionEXT.class) int value) {
        return switch (value) {
            case VK_DEVICE_FAULT_VENDOR_BINARY_HEADER_VERSION_ONE_EXT -> "VK_DEVICE_FAULT_VENDOR_BINARY_HEADER_VERSION_ONE_EXT";
            default -> "Unknown";
        };
    }
}
