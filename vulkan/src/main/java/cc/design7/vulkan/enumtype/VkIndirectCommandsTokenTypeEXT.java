package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectCommandsTokenTypeEXT.html">VkIndirectCommandsTokenTypeEXT</a>
public final class VkIndirectCommandsTokenTypeEXT {
    public static final int EXECUTION_SET = 0;
    public static final int PUSH_CONSTANT = 1;
    public static final int SEQUENCE_INDEX = 2;
    public static final int INDEX_BUFFER = 3;
    public static final int VERTEX_BUFFER = 4;
    public static final int DRAW_INDEXED = 5;
    public static final int DRAW = 6;
    public static final int DRAW_INDEXED_COUNT = 7;
    public static final int DRAW_COUNT = 8;
    public static final int DISPATCH = 9;
    public static final int DRAW_MESH_TASKS_NV = 1000202002;
    public static final int DRAW_MESH_TASKS_COUNT_NV = 1000202003;
    public static final int DRAW_MESH_TASKS = 1000328000;
    public static final int DRAW_MESH_TASKS_COUNT = 1000328001;
    public static final int TRACE_RAYS2 = 1000386004;

    public static String explain(@enumtype(VkIndirectCommandsTokenTypeEXT.class) int value) {
        return switch (value) {
            case VkIndirectCommandsTokenTypeEXT.DISPATCH -> "VK_INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_EXT";
            case VkIndirectCommandsTokenTypeEXT.DRAW_COUNT -> "VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_COUNT_EXT";
            case VkIndirectCommandsTokenTypeEXT.DRAW -> "VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_EXT";
            case VkIndirectCommandsTokenTypeEXT.DRAW_INDEXED_COUNT -> "VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_COUNT_EXT";
            case VkIndirectCommandsTokenTypeEXT.DRAW_INDEXED -> "VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_EXT";
            case VkIndirectCommandsTokenTypeEXT.DRAW_MESH_TASKS_COUNT -> "VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_COUNT_EXT";
            case VkIndirectCommandsTokenTypeEXT.DRAW_MESH_TASKS_COUNT_NV -> "VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_COUNT_NV_EXT";
            case VkIndirectCommandsTokenTypeEXT.DRAW_MESH_TASKS -> "VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_EXT";
            case VkIndirectCommandsTokenTypeEXT.DRAW_MESH_TASKS_NV -> "VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_NV_EXT";
            case VkIndirectCommandsTokenTypeEXT.EXECUTION_SET -> "VK_INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT";
            case VkIndirectCommandsTokenTypeEXT.INDEX_BUFFER -> "VK_INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_EXT";
            case VkIndirectCommandsTokenTypeEXT.PUSH_CONSTANT -> "VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_EXT";
            case VkIndirectCommandsTokenTypeEXT.SEQUENCE_INDEX -> "VK_INDIRECT_COMMANDS_TOKEN_TYPE_SEQUENCE_INDEX_EXT";
            case VkIndirectCommandsTokenTypeEXT.TRACE_RAYS2 -> "VK_INDIRECT_COMMANDS_TOKEN_TYPE_TRACE_RAYS2_EXT";
            case VkIndirectCommandsTokenTypeEXT.VERTEX_BUFFER -> "VK_INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_EXT";
            default -> "Unknown VkIndirectCommandsTokenTypeEXT: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkIndirectCommandsTokenTypeEXT() {}
}
