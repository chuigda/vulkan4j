package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkColorSpaceKHR.html">VkColorSpaceKHR</a>
public final class VkColorSpaceKHR {
    public static final int SRGB_NONLINEAR = 0;
    public static final int DISPLAY_P3_NONLINEAR_EXT = 1000104001;
    public static final int EXTENDED_SRGB_LINEAR_EXT = 1000104002;
    public static final int DISPLAY_P3_LINEAR_EXT = 1000104003;
    public static final int DCI_P3_NONLINEAR_EXT = 1000104004;
    public static final int BT709_LINEAR_EXT = 1000104005;
    public static final int BT709_NONLINEAR_EXT = 1000104006;
    public static final int BT2020_LINEAR_EXT = 1000104007;
    public static final int HDR10_ST2084_EXT = 1000104008;
    public static final int DOLBYVISION_EXT = 1000104009;
    public static final int HDR10_HLG_EXT = 1000104010;
    public static final int ADOBERGB_LINEAR_EXT = 1000104011;
    public static final int ADOBERGB_NONLINEAR_EXT = 1000104012;
    public static final int PASS_THROUGH_EXT = 1000104013;
    public static final int EXTENDED_SRGB_NONLINEAR_EXT = 1000104014;
    public static final int DISPLAY_NATIVE_AMD = 1000213000;

    public static String explain(@enumtype(VkColorSpaceKHR.class) int value) {
        return switch (value) {
            case VkColorSpaceKHR.ADOBERGB_LINEAR_EXT -> "VK_COLOR_SPACE_ADOBERGB_LINEAR_EXT";
            case VkColorSpaceKHR.ADOBERGB_NONLINEAR_EXT -> "VK_COLOR_SPACE_ADOBERGB_NONLINEAR_EXT";
            case VkColorSpaceKHR.BT2020_LINEAR_EXT -> "VK_COLOR_SPACE_BT2020_LINEAR_EXT";
            case VkColorSpaceKHR.BT709_LINEAR_EXT -> "VK_COLOR_SPACE_BT709_LINEAR_EXT";
            case VkColorSpaceKHR.BT709_NONLINEAR_EXT -> "VK_COLOR_SPACE_BT709_NONLINEAR_EXT";
            case VkColorSpaceKHR.DCI_P3_NONLINEAR_EXT -> "VK_COLOR_SPACE_DCI_P3_NONLINEAR_EXT";
            case VkColorSpaceKHR.DISPLAY_NATIVE_AMD -> "VK_COLOR_SPACE_DISPLAY_NATIVE_AMD";
            case VkColorSpaceKHR.DISPLAY_P3_LINEAR_EXT -> "VK_COLOR_SPACE_DISPLAY_P3_LINEAR_EXT";
            case VkColorSpaceKHR.DISPLAY_P3_NONLINEAR_EXT -> "VK_COLOR_SPACE_DISPLAY_P3_NONLINEAR_EXT";
            case VkColorSpaceKHR.DOLBYVISION_EXT -> "VK_COLOR_SPACE_DOLBYVISION_EXT";
            case VkColorSpaceKHR.EXTENDED_SRGB_LINEAR_EXT -> "VK_COLOR_SPACE_EXTENDED_SRGB_LINEAR_EXT";
            case VkColorSpaceKHR.EXTENDED_SRGB_NONLINEAR_EXT -> "VK_COLOR_SPACE_EXTENDED_SRGB_NONLINEAR_EXT";
            case VkColorSpaceKHR.HDR10_HLG_EXT -> "VK_COLOR_SPACE_HDR10_HLG_EXT";
            case VkColorSpaceKHR.HDR10_ST2084_EXT -> "VK_COLOR_SPACE_HDR10_ST2084_EXT";
            case VkColorSpaceKHR.PASS_THROUGH_EXT -> "VK_COLOR_SPACE_PASS_THROUGH_EXT";
            case VkColorSpaceKHR.SRGB_NONLINEAR -> "VK_COLOR_SPACE_SRGB_NONLINEAR_KHR";
            default -> "Unknown VkColorSpaceKHR: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkColorSpaceKHR() {}
}
