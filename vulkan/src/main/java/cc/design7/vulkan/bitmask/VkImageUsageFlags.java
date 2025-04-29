package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageUsageFlags.html">VkImageUsageFlags</a>
public final class VkImageUsageFlags {
    public static final int IMAGE_USAGE_ATTACHMENT_FEEDBACK_LOOP_EXT = 0x80000;
    public static final int IMAGE_USAGE_COLOR_ATTACHMENT = 0x10;
    public static final int IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT = 0x20;
    public static final int IMAGE_USAGE_FRAGMENT_DENSITY_MAP_EXT = 0x200;
    public static final int IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_KHR = 0x100;
    public static final int IMAGE_USAGE_HOST_TRANSFER = 0x400000;
    public static final int IMAGE_USAGE_INPUT_ATTACHMENT = 0x80;
    public static final int IMAGE_USAGE_INVOCATION_MASK_HUAWEI = 0x40000;
    public static final int IMAGE_USAGE_SAMPLED = 0x4;
    public static final int IMAGE_USAGE_SAMPLE_BLOCK_MATCH_QCOM = 0x200000;
    public static final int IMAGE_USAGE_SAMPLE_WEIGHT_QCOM = 0x100000;
    public static final int IMAGE_USAGE_STORAGE = 0x8;
    public static final int IMAGE_USAGE_TILE_MEMORY_QCOM = 0x8000000;
    public static final int IMAGE_USAGE_TRANSFER_DST = 0x2;
    public static final int IMAGE_USAGE_TRANSFER_SRC = 0x1;
    public static final int IMAGE_USAGE_TRANSIENT_ATTACHMENT = 0x40;
    public static final int IMAGE_USAGE_VIDEO_DECODE_DPB_KHR = 0x1000;
    public static final int IMAGE_USAGE_VIDEO_DECODE_DST_KHR = 0x400;
    public static final int IMAGE_USAGE_VIDEO_DECODE_SRC_KHR = 0x800;
    public static final int IMAGE_USAGE_VIDEO_ENCODE_DPB_KHR = 0x8000;
    public static final int IMAGE_USAGE_VIDEO_ENCODE_DST_KHR = 0x2000;
    public static final int IMAGE_USAGE_VIDEO_ENCODE_EMPHASIS_MAP_KHR = 0x4000000;
    public static final int IMAGE_USAGE_VIDEO_ENCODE_QUANTIZATION_DELTA_MAP_KHR = 0x2000000;
    public static final int IMAGE_USAGE_VIDEO_ENCODE_SRC_KHR = 0x4000;

    public static String explain(@enumtype(VkImageUsageFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & IMAGE_USAGE_ATTACHMENT_FEEDBACK_LOOP_EXT) != 0) {
            detectedFlagBits.add("VK_IMAGE_USAGE_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT");
        }
        if ((flags & IMAGE_USAGE_COLOR_ATTACHMENT) != 0) {
            detectedFlagBits.add("VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT");
        }
        if ((flags & IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT) != 0) {
            detectedFlagBits.add("VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT");
        }
        if ((flags & IMAGE_USAGE_FRAGMENT_DENSITY_MAP_EXT) != 0) {
            detectedFlagBits.add("VK_IMAGE_USAGE_FRAGMENT_DENSITY_MAP_BIT_EXT");
        }
        if ((flags & IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_KHR) != 0) {
            detectedFlagBits.add("VK_IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR");
        }
        if ((flags & IMAGE_USAGE_HOST_TRANSFER) != 0) {
            detectedFlagBits.add("VK_IMAGE_USAGE_HOST_TRANSFER_BIT");
        }
        if ((flags & IMAGE_USAGE_INPUT_ATTACHMENT) != 0) {
            detectedFlagBits.add("VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT");
        }
        if ((flags & IMAGE_USAGE_INVOCATION_MASK_HUAWEI) != 0) {
            detectedFlagBits.add("VK_IMAGE_USAGE_INVOCATION_MASK_BIT_HUAWEI");
        }
        if ((flags & IMAGE_USAGE_SAMPLED) != 0) {
            detectedFlagBits.add("VK_IMAGE_USAGE_SAMPLED_BIT");
        }
        if ((flags & IMAGE_USAGE_SAMPLE_BLOCK_MATCH_QCOM) != 0) {
            detectedFlagBits.add("VK_IMAGE_USAGE_SAMPLE_BLOCK_MATCH_BIT_QCOM");
        }
        if ((flags & IMAGE_USAGE_SAMPLE_WEIGHT_QCOM) != 0) {
            detectedFlagBits.add("VK_IMAGE_USAGE_SAMPLE_WEIGHT_BIT_QCOM");
        }
        if ((flags & IMAGE_USAGE_STORAGE) != 0) {
            detectedFlagBits.add("VK_IMAGE_USAGE_STORAGE_BIT");
        }
        if ((flags & IMAGE_USAGE_TILE_MEMORY_QCOM) != 0) {
            detectedFlagBits.add("VK_IMAGE_USAGE_TILE_MEMORY_QCOM");
        }
        if ((flags & IMAGE_USAGE_TRANSFER_DST) != 0) {
            detectedFlagBits.add("VK_IMAGE_USAGE_TRANSFER_DST_BIT");
        }
        if ((flags & IMAGE_USAGE_TRANSFER_SRC) != 0) {
            detectedFlagBits.add("VK_IMAGE_USAGE_TRANSFER_SRC_BIT");
        }
        if ((flags & IMAGE_USAGE_TRANSIENT_ATTACHMENT) != 0) {
            detectedFlagBits.add("VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT");
        }
        if ((flags & IMAGE_USAGE_VIDEO_DECODE_DPB_KHR) != 0) {
            detectedFlagBits.add("VK_IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR");
        }
        if ((flags & IMAGE_USAGE_VIDEO_DECODE_DST_KHR) != 0) {
            detectedFlagBits.add("VK_IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR");
        }
        if ((flags & IMAGE_USAGE_VIDEO_DECODE_SRC_KHR) != 0) {
            detectedFlagBits.add("VK_IMAGE_USAGE_VIDEO_DECODE_SRC_BIT_KHR");
        }
        if ((flags & IMAGE_USAGE_VIDEO_ENCODE_DPB_KHR) != 0) {
            detectedFlagBits.add("VK_IMAGE_USAGE_VIDEO_ENCODE_DPB_BIT_KHR");
        }
        if ((flags & IMAGE_USAGE_VIDEO_ENCODE_DST_KHR) != 0) {
            detectedFlagBits.add("VK_IMAGE_USAGE_VIDEO_ENCODE_DST_BIT_KHR");
        }
        if ((flags & IMAGE_USAGE_VIDEO_ENCODE_EMPHASIS_MAP_KHR) != 0) {
            detectedFlagBits.add("VK_IMAGE_USAGE_VIDEO_ENCODE_EMPHASIS_MAP_BIT_KHR");
        }
        if ((flags & IMAGE_USAGE_VIDEO_ENCODE_QUANTIZATION_DELTA_MAP_KHR) != 0) {
            detectedFlagBits.add("VK_IMAGE_USAGE_VIDEO_ENCODE_QUANTIZATION_DELTA_MAP_BIT_KHR");
        }
        if ((flags & IMAGE_USAGE_VIDEO_ENCODE_SRC_KHR) != 0) {
            detectedFlagBits.add("VK_IMAGE_USAGE_VIDEO_ENCODE_SRC_BIT_KHR");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkImageUsageFlags() {}
}
