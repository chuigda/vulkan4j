package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkStencilOp.html">VkStencilOp</a>
public final class VkStencilOp {
    public static final int KEEP = 0;
    public static final int ZERO = 1;
    public static final int REPLACE = 2;
    public static final int INCREMENT_AND_CLAMP = 3;
    public static final int DECREMENT_AND_CLAMP = 4;
    public static final int INVERT = 5;
    public static final int INCREMENT_AND_WRAP = 6;
    public static final int DECREMENT_AND_WRAP = 7;

    public static String explain(@enumtype(VkStencilOp.class) int value) {
        return switch (value) {
            case VkStencilOp.DECREMENT_AND_CLAMP -> "VK_STENCIL_OP_DECREMENT_AND_CLAMP";
            case VkStencilOp.DECREMENT_AND_WRAP -> "VK_STENCIL_OP_DECREMENT_AND_WRAP";
            case VkStencilOp.INCREMENT_AND_CLAMP -> "VK_STENCIL_OP_INCREMENT_AND_CLAMP";
            case VkStencilOp.INCREMENT_AND_WRAP -> "VK_STENCIL_OP_INCREMENT_AND_WRAP";
            case VkStencilOp.INVERT -> "VK_STENCIL_OP_INVERT";
            case VkStencilOp.KEEP -> "VK_STENCIL_OP_KEEP";
            case VkStencilOp.REPLACE -> "VK_STENCIL_OP_REPLACE";
            case VkStencilOp.ZERO -> "VK_STENCIL_OP_ZERO";
            default -> "Unknown VkStencilOp: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkStencilOp() {}
}
