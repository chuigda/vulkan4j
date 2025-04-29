package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectCommandsTokenTypeNV.html">VkIndirectCommandsTokenTypeNV</a>
public final class VkIndirectCommandsTokenTypeNV {
    public static final int SHADER_GROUP = 0;
    public static final int STATE_FLAGS = 1;
    public static final int INDEX_BUFFER = 2;
    public static final int VERTEX_BUFFER = 3;
    public static final int PUSH_CONSTANT = 4;
    public static final int DRAW_INDEXED = 5;
    public static final int DRAW = 6;
    public static final int DRAW_TASKS = 7;
    public static final int DRAW_MESH_TASKS = 1000328000;
    public static final int PIPELINE = 1000428003;
    public static final int DISPATCH = 1000428004;

    public static String explain(@enumtype(VkIndirectCommandsTokenTypeNV.class) int value) {
        return switch (value) {
            case VkIndirectCommandsTokenTypeNV.DISPATCH -> "VK_INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_NV";
            case VkIndirectCommandsTokenTypeNV.DRAW_INDEXED -> "VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_NV";
            case VkIndirectCommandsTokenTypeNV.DRAW_MESH_TASKS -> "VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_NV";
            case VkIndirectCommandsTokenTypeNV.DRAW -> "VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_NV";
            case VkIndirectCommandsTokenTypeNV.DRAW_TASKS -> "VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_TASKS_NV";
            case VkIndirectCommandsTokenTypeNV.INDEX_BUFFER -> "VK_INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_NV";
            case VkIndirectCommandsTokenTypeNV.PIPELINE -> "VK_INDIRECT_COMMANDS_TOKEN_TYPE_PIPELINE_NV";
            case VkIndirectCommandsTokenTypeNV.PUSH_CONSTANT -> "VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NV";
            case VkIndirectCommandsTokenTypeNV.SHADER_GROUP -> "VK_INDIRECT_COMMANDS_TOKEN_TYPE_SHADER_GROUP_NV";
            case VkIndirectCommandsTokenTypeNV.STATE_FLAGS -> "VK_INDIRECT_COMMANDS_TOKEN_TYPE_STATE_FLAGS_NV";
            case VkIndirectCommandsTokenTypeNV.VERTEX_BUFFER -> "VK_INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_NV";
            default -> "Unknown VkIndirectCommandsTokenTypeNV: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkIndirectCommandsTokenTypeNV() {}
}
