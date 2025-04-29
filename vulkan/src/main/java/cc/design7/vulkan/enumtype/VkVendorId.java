package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVendorId.html">VkVendorId</a>
public final class VkVendorId {
    public static final int KHRONOS = 65536;
    public static final int VIV = 65537;
    public static final int VSI = 65538;
    public static final int KAZAN = 65539;
    public static final int CODEPLAY = 65540;
    public static final int MESA = 65541;
    public static final int POCL = 65542;
    public static final int MOBILEYE = 65543;

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
