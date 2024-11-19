package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkVendorId {
    public static final int VK_VENDOR_ID_KHRONOS = 65536;
    public static final int VK_VENDOR_ID_VIV = 65537;
    public static final int VK_VENDOR_ID_VSI = 65538;
    public static final int VK_VENDOR_ID_KAZAN = 65539;
    public static final int VK_VENDOR_ID_CODEPLAY = 65540;
    public static final int VK_VENDOR_ID_MESA = 65541;
    public static final int VK_VENDOR_ID_POCL = 65542;
    public static final int VK_VENDOR_ID_MOBILEYE = 65543;

    public static String explain(@enumtype(VkVendorId.class) int value) {
        return switch (value) {
            case VK_VENDOR_ID_KHRONOS -> "VK_VENDOR_ID_KHRONOS";
            case VK_VENDOR_ID_VIV -> "VK_VENDOR_ID_VIV";
            case VK_VENDOR_ID_VSI -> "VK_VENDOR_ID_VSI";
            case VK_VENDOR_ID_KAZAN -> "VK_VENDOR_ID_KAZAN";
            case VK_VENDOR_ID_CODEPLAY -> "VK_VENDOR_ID_CODEPLAY";
            case VK_VENDOR_ID_MESA -> "VK_VENDOR_ID_MESA";
            case VK_VENDOR_ID_POCL -> "VK_VENDOR_ID_POCL";
            case VK_VENDOR_ID_MOBILEYE -> "VK_VENDOR_ID_MOBILEYE";
            default -> "Unknown";
        };
    }
}
