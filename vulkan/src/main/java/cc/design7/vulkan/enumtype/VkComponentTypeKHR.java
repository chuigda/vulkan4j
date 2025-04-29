package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkComponentTypeKHR.html">VkComponentTypeKHR</a>
public final class VkComponentTypeKHR {
    public static final int FLOAT16 = 0;
    public static final int FLOAT32 = 1;
    public static final int FLOAT64 = 2;
    public static final int SINT8 = 3;
    public static final int SINT16 = 4;
    public static final int SINT32 = 5;
    public static final int SINT64 = 6;
    public static final int UINT8 = 7;
    public static final int UINT16 = 8;
    public static final int UINT32 = 9;
    public static final int UINT64 = 10;
    public static final int BFLOAT16 = 1000141000;
    public static final int SINT8_PACKED_NV = 1000491000;
    public static final int UINT8_PACKED_NV = 1000491001;
    public static final int FLOAT_E4M3_NV = 1000491002;
    public static final int FLOAT_E5M2_NV = 1000491003;

    public static String explain(@enumtype(VkComponentTypeKHR.class) int value) {
        return switch (value) {
            case VkComponentTypeKHR.BFLOAT16 -> "VK_COMPONENT_TYPE_BFLOAT16_KHR";
            case VkComponentTypeKHR.FLOAT16 -> "VK_COMPONENT_TYPE_FLOAT16_KHR";
            case VkComponentTypeKHR.FLOAT32 -> "VK_COMPONENT_TYPE_FLOAT32_KHR";
            case VkComponentTypeKHR.FLOAT64 -> "VK_COMPONENT_TYPE_FLOAT64_KHR";
            case VkComponentTypeKHR.FLOAT_E4M3_NV -> "VK_COMPONENT_TYPE_FLOAT_E4M3_NV";
            case VkComponentTypeKHR.FLOAT_E5M2_NV -> "VK_COMPONENT_TYPE_FLOAT_E5M2_NV";
            case VkComponentTypeKHR.SINT16 -> "VK_COMPONENT_TYPE_SINT16_KHR";
            case VkComponentTypeKHR.SINT32 -> "VK_COMPONENT_TYPE_SINT32_KHR";
            case VkComponentTypeKHR.SINT64 -> "VK_COMPONENT_TYPE_SINT64_KHR";
            case VkComponentTypeKHR.SINT8 -> "VK_COMPONENT_TYPE_SINT8_KHR";
            case VkComponentTypeKHR.SINT8_PACKED_NV -> "VK_COMPONENT_TYPE_SINT8_PACKED_NV";
            case VkComponentTypeKHR.UINT16 -> "VK_COMPONENT_TYPE_UINT16_KHR";
            case VkComponentTypeKHR.UINT32 -> "VK_COMPONENT_TYPE_UINT32_KHR";
            case VkComponentTypeKHR.UINT64 -> "VK_COMPONENT_TYPE_UINT64_KHR";
            case VkComponentTypeKHR.UINT8 -> "VK_COMPONENT_TYPE_UINT8_KHR";
            case VkComponentTypeKHR.UINT8_PACKED_NV -> "VK_COMPONENT_TYPE_UINT8_PACKED_NV";
            default -> "Unknown VkComponentTypeKHR: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkComponentTypeKHR() {}
}
