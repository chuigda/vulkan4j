package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkLogicOp {
    public static final int VK_LOGIC_OP_CLEAR = 0;
    public static final int VK_LOGIC_OP_AND = 1;
    public static final int VK_LOGIC_OP_AND_REVERSE = 2;
    public static final int VK_LOGIC_OP_COPY = 3;
    public static final int VK_LOGIC_OP_AND_INVERTED = 4;
    public static final int VK_LOGIC_OP_NO_OP = 5;
    public static final int VK_LOGIC_OP_XOR = 6;
    public static final int VK_LOGIC_OP_OR = 7;
    public static final int VK_LOGIC_OP_NOR = 8;
    public static final int VK_LOGIC_OP_EQUIVALENT = 9;
    public static final int VK_LOGIC_OP_INVERT = 10;
    public static final int VK_LOGIC_OP_OR_REVERSE = 11;
    public static final int VK_LOGIC_OP_COPY_INVERTED = 12;
    public static final int VK_LOGIC_OP_OR_INVERTED = 13;
    public static final int VK_LOGIC_OP_NAND = 14;
    public static final int VK_LOGIC_OP_SET = 15;

    public static String explain(@enumtype(VkLogicOp.class) int value) {
        return switch (value) {
            case VK_LOGIC_OP_CLEAR -> "VK_LOGIC_OP_CLEAR";
            case VK_LOGIC_OP_AND -> "VK_LOGIC_OP_AND";
            case VK_LOGIC_OP_AND_REVERSE -> "VK_LOGIC_OP_AND_REVERSE";
            case VK_LOGIC_OP_COPY -> "VK_LOGIC_OP_COPY";
            case VK_LOGIC_OP_AND_INVERTED -> "VK_LOGIC_OP_AND_INVERTED";
            case VK_LOGIC_OP_NO_OP -> "VK_LOGIC_OP_NO_OP";
            case VK_LOGIC_OP_XOR -> "VK_LOGIC_OP_XOR";
            case VK_LOGIC_OP_OR -> "VK_LOGIC_OP_OR";
            case VK_LOGIC_OP_NOR -> "VK_LOGIC_OP_NOR";
            case VK_LOGIC_OP_EQUIVALENT -> "VK_LOGIC_OP_EQUIVALENT";
            case VK_LOGIC_OP_INVERT -> "VK_LOGIC_OP_INVERT";
            case VK_LOGIC_OP_OR_REVERSE -> "VK_LOGIC_OP_OR_REVERSE";
            case VK_LOGIC_OP_COPY_INVERTED -> "VK_LOGIC_OP_COPY_INVERTED";
            case VK_LOGIC_OP_OR_INVERTED -> "VK_LOGIC_OP_OR_INVERTED";
            case VK_LOGIC_OP_NAND -> "VK_LOGIC_OP_NAND";
            case VK_LOGIC_OP_SET -> "VK_LOGIC_OP_SET";
            default -> "Unknown";
        };
    }
}
