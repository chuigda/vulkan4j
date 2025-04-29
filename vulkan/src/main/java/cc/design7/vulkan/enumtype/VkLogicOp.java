package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkLogicOp.html">VkLogicOp</a>
public final class VkLogicOp {
    public static final int CLEAR = 0;
    public static final int AND = 1;
    public static final int AND_REVERSE = 2;
    public static final int COPY = 3;
    public static final int AND_INVERTED = 4;
    public static final int NO_OP = 5;
    public static final int XOR = 6;
    public static final int OR = 7;
    public static final int NOR = 8;
    public static final int EQUIVALENT = 9;
    public static final int INVERT = 10;
    public static final int OR_REVERSE = 11;
    public static final int COPY_INVERTED = 12;
    public static final int OR_INVERTED = 13;
    public static final int NAND = 14;
    public static final int SET = 15;

    public static String explain(@enumtype(VkLogicOp.class) int value) {
        return switch (value) {
            case VkLogicOp.AND -> "VK_LOGIC_OP_AND";
            case VkLogicOp.AND_INVERTED -> "VK_LOGIC_OP_AND_INVERTED";
            case VkLogicOp.AND_REVERSE -> "VK_LOGIC_OP_AND_REVERSE";
            case VkLogicOp.CLEAR -> "VK_LOGIC_OP_CLEAR";
            case VkLogicOp.COPY -> "VK_LOGIC_OP_COPY";
            case VkLogicOp.COPY_INVERTED -> "VK_LOGIC_OP_COPY_INVERTED";
            case VkLogicOp.EQUIVALENT -> "VK_LOGIC_OP_EQUIVALENT";
            case VkLogicOp.INVERT -> "VK_LOGIC_OP_INVERT";
            case VkLogicOp.NAND -> "VK_LOGIC_OP_NAND";
            case VkLogicOp.NOR -> "VK_LOGIC_OP_NOR";
            case VkLogicOp.NO_OP -> "VK_LOGIC_OP_NO_OP";
            case VkLogicOp.OR -> "VK_LOGIC_OP_OR";
            case VkLogicOp.OR_INVERTED -> "VK_LOGIC_OP_OR_INVERTED";
            case VkLogicOp.OR_REVERSE -> "VK_LOGIC_OP_OR_REVERSE";
            case VkLogicOp.SET -> "VK_LOGIC_OP_SET";
            case VkLogicOp.XOR -> "VK_LOGIC_OP_XOR";
            default -> "Unknown VkLogicOp: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkLogicOp() {}
}
