package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkCompareOp {
    public static final int VK_COMPARE_OP_NEVER = 0;
    public static final int VK_COMPARE_OP_LESS = 1;
    public static final int VK_COMPARE_OP_EQUAL = 2;
    public static final int VK_COMPARE_OP_LESS_OR_EQUAL = 3;
    public static final int VK_COMPARE_OP_GREATER = 4;
    public static final int VK_COMPARE_OP_NOT_EQUAL = 5;
    public static final int VK_COMPARE_OP_GREATER_OR_EQUAL = 6;
    public static final int VK_COMPARE_OP_ALWAYS = 7;

    public static String explain(@enumtype(VkCompareOp.class) int value) {
        return switch (value) {
            case VK_COMPARE_OP_NEVER -> "VK_COMPARE_OP_NEVER";
            case VK_COMPARE_OP_LESS -> "VK_COMPARE_OP_LESS";
            case VK_COMPARE_OP_EQUAL -> "VK_COMPARE_OP_EQUAL";
            case VK_COMPARE_OP_LESS_OR_EQUAL -> "VK_COMPARE_OP_LESS_OR_EQUAL";
            case VK_COMPARE_OP_GREATER -> "VK_COMPARE_OP_GREATER";
            case VK_COMPARE_OP_NOT_EQUAL -> "VK_COMPARE_OP_NOT_EQUAL";
            case VK_COMPARE_OP_GREATER_OR_EQUAL -> "VK_COMPARE_OP_GREATER_OR_EQUAL";
            case VK_COMPARE_OP_ALWAYS -> "VK_COMPARE_OP_ALWAYS";
            default -> "Unknown";
        };
    }
}
