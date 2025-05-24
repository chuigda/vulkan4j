package club.doki7.vulkan.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceFaultVendorBinaryHeaderVersionEXT.html"><code>VkDeviceFaultVendorBinaryHeaderVersionEXT</code></a>
public final class VkDeviceFaultVendorBinaryHeaderVersionEXT {
    public static final int ONE = 0x1;

    public static String explain(@EnumType(VkDeviceFaultVendorBinaryHeaderVersionEXT.class) int value) {
        return switch (value) {
            case VkDeviceFaultVendorBinaryHeaderVersionEXT.ONE -> "VK_DEVICE_FAULT_VENDOR_BINARY_HEADER_VERSION_ONE_EXT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkDeviceFaultVendorBinaryHeaderVersionEXT() {}
}
