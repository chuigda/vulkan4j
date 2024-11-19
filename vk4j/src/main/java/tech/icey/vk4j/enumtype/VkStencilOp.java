package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkStencilOp {
    public static final int VK_STENCIL_OP_KEEP = 0;
    public static final int VK_STENCIL_OP_ZERO = 1;
    public static final int VK_STENCIL_OP_REPLACE = 2;
    public static final int VK_STENCIL_OP_INCREMENT_AND_CLAMP = 3;
    public static final int VK_STENCIL_OP_DECREMENT_AND_CLAMP = 4;
    public static final int VK_STENCIL_OP_INVERT = 5;
    public static final int VK_STENCIL_OP_INCREMENT_AND_WRAP = 6;
    public static final int VK_STENCIL_OP_DECREMENT_AND_WRAP = 7;

    public static String explain(@enumtype(VkStencilOp.class) int value) {
        return switch (value) {
            case VK_STENCIL_OP_KEEP -> "VK_STENCIL_OP_KEEP";
            case VK_STENCIL_OP_ZERO -> "VK_STENCIL_OP_ZERO";
            case VK_STENCIL_OP_REPLACE -> "VK_STENCIL_OP_REPLACE";
            case VK_STENCIL_OP_INCREMENT_AND_CLAMP -> "VK_STENCIL_OP_INCREMENT_AND_CLAMP";
            case VK_STENCIL_OP_DECREMENT_AND_CLAMP -> "VK_STENCIL_OP_DECREMENT_AND_CLAMP";
            case VK_STENCIL_OP_INVERT -> "VK_STENCIL_OP_INVERT";
            case VK_STENCIL_OP_INCREMENT_AND_WRAP -> "VK_STENCIL_OP_INCREMENT_AND_WRAP";
            case VK_STENCIL_OP_DECREMENT_AND_WRAP -> "VK_STENCIL_OP_DECREMENT_AND_WRAP";
            default -> "Unknown";
        };
    }
}
