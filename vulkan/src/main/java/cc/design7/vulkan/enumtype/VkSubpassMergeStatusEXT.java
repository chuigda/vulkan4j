package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSubpassMergeStatusEXT.html">VkSubpassMergeStatusEXT</a>
public final class VkSubpassMergeStatusEXT {
    public static final int MERGED = 0;
    public static final int DISALLOWED = 1;
    public static final int NOT_MERGED_SIDE_EFFECTS = 2;
    public static final int NOT_MERGED_SAMPLES_MISMATCH = 3;
    public static final int NOT_MERGED_VIEWS_MISMATCH = 4;
    public static final int NOT_MERGED_ALIASING = 5;
    public static final int NOT_MERGED_DEPENDENCIES = 6;
    public static final int NOT_MERGED_INCOMPATIBLE_INPUT_ATTACHMENT = 7;
    public static final int NOT_MERGED_TOO_MANY_ATTACHMENTS = 8;
    public static final int NOT_MERGED_INSUFFICIENT_STORAGE = 9;
    public static final int NOT_MERGED_DEPTH_STENCIL_COUNT = 10;
    public static final int NOT_MERGED_RESOLVE_ATTACHMENT_REUSE = 11;
    public static final int NOT_MERGED_SINGLE_SUBPASS = 12;
    public static final int NOT_MERGED_UNSPECIFIED = 13;

    public static String explain(@enumtype(VkSubpassMergeStatusEXT.class) int value) {
        return switch (value) {
            case VkSubpassMergeStatusEXT.DISALLOWED -> "VK_SUBPASS_MERGE_STATUS_DISALLOWED_EXT";
            case VkSubpassMergeStatusEXT.MERGED -> "VK_SUBPASS_MERGE_STATUS_MERGED_EXT";
            case VkSubpassMergeStatusEXT.NOT_MERGED_ALIASING -> "VK_SUBPASS_MERGE_STATUS_NOT_MERGED_ALIASING_EXT";
            case VkSubpassMergeStatusEXT.NOT_MERGED_DEPENDENCIES -> "VK_SUBPASS_MERGE_STATUS_NOT_MERGED_DEPENDENCIES_EXT";
            case VkSubpassMergeStatusEXT.NOT_MERGED_DEPTH_STENCIL_COUNT -> "VK_SUBPASS_MERGE_STATUS_NOT_MERGED_DEPTH_STENCIL_COUNT_EXT";
            case VkSubpassMergeStatusEXT.NOT_MERGED_INCOMPATIBLE_INPUT_ATTACHMENT -> "VK_SUBPASS_MERGE_STATUS_NOT_MERGED_INCOMPATIBLE_INPUT_ATTACHMENT_EXT";
            case VkSubpassMergeStatusEXT.NOT_MERGED_INSUFFICIENT_STORAGE -> "VK_SUBPASS_MERGE_STATUS_NOT_MERGED_INSUFFICIENT_STORAGE_EXT";
            case VkSubpassMergeStatusEXT.NOT_MERGED_RESOLVE_ATTACHMENT_REUSE -> "VK_SUBPASS_MERGE_STATUS_NOT_MERGED_RESOLVE_ATTACHMENT_REUSE_EXT";
            case VkSubpassMergeStatusEXT.NOT_MERGED_SAMPLES_MISMATCH -> "VK_SUBPASS_MERGE_STATUS_NOT_MERGED_SAMPLES_MISMATCH_EXT";
            case VkSubpassMergeStatusEXT.NOT_MERGED_SIDE_EFFECTS -> "VK_SUBPASS_MERGE_STATUS_NOT_MERGED_SIDE_EFFECTS_EXT";
            case VkSubpassMergeStatusEXT.NOT_MERGED_SINGLE_SUBPASS -> "VK_SUBPASS_MERGE_STATUS_NOT_MERGED_SINGLE_SUBPASS_EXT";
            case VkSubpassMergeStatusEXT.NOT_MERGED_TOO_MANY_ATTACHMENTS -> "VK_SUBPASS_MERGE_STATUS_NOT_MERGED_TOO_MANY_ATTACHMENTS_EXT";
            case VkSubpassMergeStatusEXT.NOT_MERGED_UNSPECIFIED -> "VK_SUBPASS_MERGE_STATUS_NOT_MERGED_UNSPECIFIED_EXT";
            case VkSubpassMergeStatusEXT.NOT_MERGED_VIEWS_MISMATCH -> "VK_SUBPASS_MERGE_STATUS_NOT_MERGED_VIEWS_MISMATCH_EXT";
            default -> "Unknown VkSubpassMergeStatusEXT: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkSubpassMergeStatusEXT() {}
}
