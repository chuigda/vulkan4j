package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceFaultVendorBinaryHeaderVersionEXT.html">VkDeviceFaultVendorBinaryHeaderVersionEXT</a>
public final class VkDeviceFaultVendorBinaryHeaderVersionEXT {
    public static final int ONE = 0x1;

    public static String explain(@enumtype(VkDeviceFaultVendorBinaryHeaderVersionEXT.class) int value) {
        return switch (value) {
            case VkDeviceFaultVendorBinaryHeaderVersionEXT.ONE -> "VK_DEVICE_FAULT_VENDOR_BINARY_HEADER_VERSION_ONE_EXT";
            default -> "Unknown VkDeviceFaultVendorBinaryHeaderVersionEXT: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkDeviceFaultVendorBinaryHeaderVersionEXT() {}
}
