package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkComponentTypeKHR {
    public static final int VK_COMPONENT_TYPE_FLOAT16_KHR = 0;
    public static final int VK_COMPONENT_TYPE_FLOAT32_KHR = 1;
    public static final int VK_COMPONENT_TYPE_FLOAT64_KHR = 2;
    public static final int VK_COMPONENT_TYPE_SINT8_KHR = 3;
    public static final int VK_COMPONENT_TYPE_SINT16_KHR = 4;
    public static final int VK_COMPONENT_TYPE_SINT32_KHR = 5;
    public static final int VK_COMPONENT_TYPE_SINT64_KHR = 6;
    public static final int VK_COMPONENT_TYPE_UINT8_KHR = 7;
    public static final int VK_COMPONENT_TYPE_UINT16_KHR = 8;
    public static final int VK_COMPONENT_TYPE_UINT32_KHR = 9;
    public static final int VK_COMPONENT_TYPE_UINT64_KHR = 10;

    public static String explain(@enumtype(VkComponentTypeKHR.class) int value) {
        return switch (value) {
            case VK_COMPONENT_TYPE_FLOAT16_KHR -> "VK_COMPONENT_TYPE_FLOAT16_KHR";
            case VK_COMPONENT_TYPE_FLOAT32_KHR -> "VK_COMPONENT_TYPE_FLOAT32_KHR";
            case VK_COMPONENT_TYPE_FLOAT64_KHR -> "VK_COMPONENT_TYPE_FLOAT64_KHR";
            case VK_COMPONENT_TYPE_SINT8_KHR -> "VK_COMPONENT_TYPE_SINT8_KHR";
            case VK_COMPONENT_TYPE_SINT16_KHR -> "VK_COMPONENT_TYPE_SINT16_KHR";
            case VK_COMPONENT_TYPE_SINT32_KHR -> "VK_COMPONENT_TYPE_SINT32_KHR";
            case VK_COMPONENT_TYPE_SINT64_KHR -> "VK_COMPONENT_TYPE_SINT64_KHR";
            case VK_COMPONENT_TYPE_UINT8_KHR -> "VK_COMPONENT_TYPE_UINT8_KHR";
            case VK_COMPONENT_TYPE_UINT16_KHR -> "VK_COMPONENT_TYPE_UINT16_KHR";
            case VK_COMPONENT_TYPE_UINT32_KHR -> "VK_COMPONENT_TYPE_UINT32_KHR";
            case VK_COMPONENT_TYPE_UINT64_KHR -> "VK_COMPONENT_TYPE_UINT64_KHR";
            default -> "Unknown";
        };
    }
}
