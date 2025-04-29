package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageLayout.html">VkImageLayout</a>
public final class VkImageLayout {
    public static final int UNDEFINED = 0;
    public static final int GENERAL = 1;
    public static final int COLOR_ATTACHMENT_OPTIMAL = 2;
    public static final int DEPTH_STENCIL_ATTACHMENT_OPTIMAL = 3;
    public static final int DEPTH_STENCIL_READ_ONLY_OPTIMAL = 4;
    public static final int SHADER_READ_ONLY_OPTIMAL = 5;
    public static final int TRANSFER_SRC_OPTIMAL = 6;
    public static final int TRANSFER_DST_OPTIMAL = 7;
    public static final int PREINITIALIZED = 8;
    public static final int DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL = 1000117000;
    public static final int DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL = 1000117001;
    public static final int DEPTH_ATTACHMENT_OPTIMAL = 1000241000;
    public static final int DEPTH_READ_ONLY_OPTIMAL = 1000241001;
    public static final int STENCIL_ATTACHMENT_OPTIMAL = 1000241002;
    public static final int STENCIL_READ_ONLY_OPTIMAL = 1000241003;
    public static final int READ_ONLY_OPTIMAL = 1000314000;
    public static final int ATTACHMENT_OPTIMAL = 1000314001;
    public static final int RENDERING_LOCAL_READ = 1000232000;
    public static final int PRESENT_SRC_KHR = 1000001002;
    public static final int VIDEO_DECODE_DST_KHR = 1000024000;
    public static final int VIDEO_DECODE_SRC_KHR = 1000024001;
    public static final int VIDEO_DECODE_DPB_KHR = 1000024002;
    public static final int SHARED_PRESENT_KHR = 1000111000;
    public static final int FRAGMENT_DENSITY_MAP_OPTIMAL_EXT = 1000218000;
    public static final int FRAGMENT_SHADING_RATE_ATTACHMENT_OPTIMAL_KHR = 1000164003;
    public static final int VIDEO_ENCODE_DST_KHR = 1000299000;
    public static final int VIDEO_ENCODE_SRC_KHR = 1000299001;
    public static final int VIDEO_ENCODE_DPB_KHR = 1000299002;
    public static final int ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT = 1000339000;
    public static final int VIDEO_ENCODE_QUANTIZATION_MAP_KHR = 1000553000;

    public static String explain(@enumtype(VkImageLayout.class) int value) {
        return switch (value) {
            case VkImageLayout.ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT -> "VK_IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT";
            case VkImageLayout.ATTACHMENT_OPTIMAL -> "VK_IMAGE_LAYOUT_ATTACHMENT_OPTIMAL";
            case VkImageLayout.COLOR_ATTACHMENT_OPTIMAL -> "VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL";
            case VkImageLayout.DEPTH_ATTACHMENT_OPTIMAL -> "VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL";
            case VkImageLayout.DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL -> "VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL";
            case VkImageLayout.DEPTH_READ_ONLY_OPTIMAL -> "VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL";
            case VkImageLayout.DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL -> "VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL";
            case VkImageLayout.DEPTH_STENCIL_ATTACHMENT_OPTIMAL -> "VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL";
            case VkImageLayout.DEPTH_STENCIL_READ_ONLY_OPTIMAL -> "VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL";
            case VkImageLayout.FRAGMENT_DENSITY_MAP_OPTIMAL_EXT -> "VK_IMAGE_LAYOUT_FRAGMENT_DENSITY_MAP_OPTIMAL_EXT";
            case VkImageLayout.FRAGMENT_SHADING_RATE_ATTACHMENT_OPTIMAL_KHR -> "VK_IMAGE_LAYOUT_FRAGMENT_SHADING_RATE_ATTACHMENT_OPTIMAL_KHR";
            case VkImageLayout.GENERAL -> "VK_IMAGE_LAYOUT_GENERAL";
            case VkImageLayout.PREINITIALIZED -> "VK_IMAGE_LAYOUT_PREINITIALIZED";
            case VkImageLayout.PRESENT_SRC_KHR -> "VK_IMAGE_LAYOUT_PRESENT_SRC_KHR";
            case VkImageLayout.READ_ONLY_OPTIMAL -> "VK_IMAGE_LAYOUT_READ_ONLY_OPTIMAL";
            case VkImageLayout.RENDERING_LOCAL_READ -> "VK_IMAGE_LAYOUT_RENDERING_LOCAL_READ";
            case VkImageLayout.SHADER_READ_ONLY_OPTIMAL -> "VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL";
            case VkImageLayout.SHARED_PRESENT_KHR -> "VK_IMAGE_LAYOUT_SHARED_PRESENT_KHR";
            case VkImageLayout.STENCIL_ATTACHMENT_OPTIMAL -> "VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL";
            case VkImageLayout.STENCIL_READ_ONLY_OPTIMAL -> "VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL";
            case VkImageLayout.TRANSFER_DST_OPTIMAL -> "VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL";
            case VkImageLayout.TRANSFER_SRC_OPTIMAL -> "VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL";
            case VkImageLayout.UNDEFINED -> "VK_IMAGE_LAYOUT_UNDEFINED";
            case VkImageLayout.VIDEO_DECODE_DPB_KHR -> "VK_IMAGE_LAYOUT_VIDEO_DECODE_DPB_KHR";
            case VkImageLayout.VIDEO_DECODE_DST_KHR -> "VK_IMAGE_LAYOUT_VIDEO_DECODE_DST_KHR";
            case VkImageLayout.VIDEO_DECODE_SRC_KHR -> "VK_IMAGE_LAYOUT_VIDEO_DECODE_SRC_KHR";
            case VkImageLayout.VIDEO_ENCODE_DPB_KHR -> "VK_IMAGE_LAYOUT_VIDEO_ENCODE_DPB_KHR";
            case VkImageLayout.VIDEO_ENCODE_DST_KHR -> "VK_IMAGE_LAYOUT_VIDEO_ENCODE_DST_KHR";
            case VkImageLayout.VIDEO_ENCODE_QUANTIZATION_MAP_KHR -> "VK_IMAGE_LAYOUT_VIDEO_ENCODE_QUANTIZATION_MAP_KHR";
            case VkImageLayout.VIDEO_ENCODE_SRC_KHR -> "VK_IMAGE_LAYOUT_VIDEO_ENCODE_SRC_KHR";
            default -> "Unknown VkImageLayout: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkImageLayout() {}
}
