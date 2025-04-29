package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkLayerSettingTypeEXT.html">VkLayerSettingTypeEXT</a>
public final class VkLayerSettingTypeEXT {
    public static final int BOOL32 = 0;
    public static final int INT32 = 1;
    public static final int INT64 = 2;
    public static final int UINT32 = 3;
    public static final int UINT64 = 4;
    public static final int FLOAT32 = 5;
    public static final int FLOAT64 = 6;
    public static final int STRING = 7;

    public static String explain(@enumtype(VkLayerSettingTypeEXT.class) int value) {
        return switch (value) {
            case VkLayerSettingTypeEXT.BOOL32 -> "VK_LAYER_SETTING_TYPE_BOOL32_EXT";
            case VkLayerSettingTypeEXT.FLOAT32 -> "VK_LAYER_SETTING_TYPE_FLOAT32_EXT";
            case VkLayerSettingTypeEXT.FLOAT64 -> "VK_LAYER_SETTING_TYPE_FLOAT64_EXT";
            case VkLayerSettingTypeEXT.INT32 -> "VK_LAYER_SETTING_TYPE_INT32_EXT";
            case VkLayerSettingTypeEXT.INT64 -> "VK_LAYER_SETTING_TYPE_INT64_EXT";
            case VkLayerSettingTypeEXT.STRING -> "VK_LAYER_SETTING_TYPE_STRING_EXT";
            case VkLayerSettingTypeEXT.UINT32 -> "VK_LAYER_SETTING_TYPE_UINT32_EXT";
            case VkLayerSettingTypeEXT.UINT64 -> "VK_LAYER_SETTING_TYPE_UINT64_EXT";
            default -> "Unknown VkLayerSettingTypeEXT: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkLayerSettingTypeEXT() {}
}
