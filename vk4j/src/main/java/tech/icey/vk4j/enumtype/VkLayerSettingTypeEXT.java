package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkLayerSettingTypeEXT {
    public static final int VK_LAYER_SETTING_TYPE_BOOL32_EXT = 0;
    public static final int VK_LAYER_SETTING_TYPE_INT32_EXT = 1;
    public static final int VK_LAYER_SETTING_TYPE_INT64_EXT = 2;
    public static final int VK_LAYER_SETTING_TYPE_UINT32_EXT = 3;
    public static final int VK_LAYER_SETTING_TYPE_UINT64_EXT = 4;
    public static final int VK_LAYER_SETTING_TYPE_FLOAT32_EXT = 5;
    public static final int VK_LAYER_SETTING_TYPE_FLOAT64_EXT = 6;
    public static final int VK_LAYER_SETTING_TYPE_STRING_EXT = 7;

    public static String explain(@enumtype(VkLayerSettingTypeEXT.class) int value) {
        return switch (value) {
            case VK_LAYER_SETTING_TYPE_BOOL32_EXT -> "VK_LAYER_SETTING_TYPE_BOOL32_EXT";
            case VK_LAYER_SETTING_TYPE_INT32_EXT -> "VK_LAYER_SETTING_TYPE_INT32_EXT";
            case VK_LAYER_SETTING_TYPE_INT64_EXT -> "VK_LAYER_SETTING_TYPE_INT64_EXT";
            case VK_LAYER_SETTING_TYPE_UINT32_EXT -> "VK_LAYER_SETTING_TYPE_UINT32_EXT";
            case VK_LAYER_SETTING_TYPE_UINT64_EXT -> "VK_LAYER_SETTING_TYPE_UINT64_EXT";
            case VK_LAYER_SETTING_TYPE_FLOAT32_EXT -> "VK_LAYER_SETTING_TYPE_FLOAT32_EXT";
            case VK_LAYER_SETTING_TYPE_FLOAT64_EXT -> "VK_LAYER_SETTING_TYPE_FLOAT64_EXT";
            case VK_LAYER_SETTING_TYPE_STRING_EXT -> "VK_LAYER_SETTING_TYPE_STRING_EXT";
            default -> "Unknown";
        };
    }
}
