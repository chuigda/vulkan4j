package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVendorId.html">VkVendorId</a>
public final class VkVendorId {
    public static final int KHRONOS = 0x10000;
    public static final int VIV = 0x10001;
    public static final int VSI = 0x10002;
    public static final int KAZAN = 0x10003;
    public static final int CODEPLAY = 0x10004;
    public static final int MESA = 0x10005;
    public static final int POCL = 0x10006;
    public static final int MOBILEYE = 0x10007;

    public static String explain(@enumtype(VkVendorId.class) int value) {
        return switch (value) {
            case VkVendorId.CODEPLAY -> "VK_VENDOR_ID_CODEPLAY";
            case VkVendorId.KAZAN -> "VK_VENDOR_ID_KAZAN";
            case VkVendorId.KHRONOS -> "VK_VENDOR_ID_KHRONOS";
            case VkVendorId.MESA -> "VK_VENDOR_ID_MESA";
            case VkVendorId.MOBILEYE -> "VK_VENDOR_ID_MOBILEYE";
            case VkVendorId.POCL -> "VK_VENDOR_ID_POCL";
            case VkVendorId.VIV -> "VK_VENDOR_ID_VIV";
            case VkVendorId.VSI -> "VK_VENDOR_ID_VSI";
            default -> "Unknown VkVendorId: " + value;
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkVendorId() {}
}
