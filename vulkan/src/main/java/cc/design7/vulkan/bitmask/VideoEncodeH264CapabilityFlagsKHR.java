package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH264CapabilityFlagsKHR.html">VkVideoEncodeH264CapabilityFlagsKHR</a>
public final class VideoEncodeH264CapabilityFlagsKHR {
    public static final int VIDEO_ENCODE_H264_CAPABILITY_B_FRAME_IN_L0_LIST = 0x10;
    public static final int VIDEO_ENCODE_H264_CAPABILITY_B_FRAME_IN_L1_LIST = 0x20;
    public static final int VIDEO_ENCODE_H264_CAPABILITY_DIFFERENT_SLICE_TYPE = 0x8;
    public static final int VIDEO_ENCODE_H264_CAPABILITY_GENERATE_PREFIX_NALU = 0x100;
    public static final int VIDEO_ENCODE_H264_CAPABILITY_HRD_COMPLIANCE = 0x1;
    public static final int VIDEO_ENCODE_H264_CAPABILITY_MB_QP_DIFF_WRAPAROUND = 0x200;
    public static final int VIDEO_ENCODE_H264_CAPABILITY_PER_PICTURE_TYPE_MIN_MAX_QP = 0x40;
    public static final int VIDEO_ENCODE_H264_CAPABILITY_PER_SLICE_CONSTANT_QP = 0x80;
    public static final int VIDEO_ENCODE_H264_CAPABILITY_PREDICTION_WEIGHT_TABLE_GENERATED = 0x2;
    public static final int VIDEO_ENCODE_H264_CAPABILITY_ROW_UNALIGNED_SLICE = 0x4;

    public static String explain(@enumtype(VideoEncodeH264CapabilityFlagsKHR.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & VIDEO_ENCODE_H264_CAPABILITY_B_FRAME_IN_L0_LIST) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_H264_CAPABILITY_B_FRAME_IN_L0_LIST_BIT_KHR");
        }
        if ((flags & VIDEO_ENCODE_H264_CAPABILITY_B_FRAME_IN_L1_LIST) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_H264_CAPABILITY_B_FRAME_IN_L1_LIST_BIT_KHR");
        }
        if ((flags & VIDEO_ENCODE_H264_CAPABILITY_DIFFERENT_SLICE_TYPE) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_H264_CAPABILITY_DIFFERENT_SLICE_TYPE_BIT_KHR");
        }
        if ((flags & VIDEO_ENCODE_H264_CAPABILITY_GENERATE_PREFIX_NALU) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_H264_CAPABILITY_GENERATE_PREFIX_NALU_BIT_KHR");
        }
        if ((flags & VIDEO_ENCODE_H264_CAPABILITY_HRD_COMPLIANCE) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_H264_CAPABILITY_HRD_COMPLIANCE_BIT_KHR");
        }
        if ((flags & VIDEO_ENCODE_H264_CAPABILITY_MB_QP_DIFF_WRAPAROUND) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_H264_CAPABILITY_MB_QP_DIFF_WRAPAROUND_BIT_KHR");
        }
        if ((flags & VIDEO_ENCODE_H264_CAPABILITY_PER_PICTURE_TYPE_MIN_MAX_QP) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_H264_CAPABILITY_PER_PICTURE_TYPE_MIN_MAX_QP_BIT_KHR");
        }
        if ((flags & VIDEO_ENCODE_H264_CAPABILITY_PER_SLICE_CONSTANT_QP) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_H264_CAPABILITY_PER_SLICE_CONSTANT_QP_BIT_KHR");
        }
        if ((flags & VIDEO_ENCODE_H264_CAPABILITY_PREDICTION_WEIGHT_TABLE_GENERATED) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_H264_CAPABILITY_PREDICTION_WEIGHT_TABLE_GENERATED_BIT_KHR");
        }
        if ((flags & VIDEO_ENCODE_H264_CAPABILITY_ROW_UNALIGNED_SLICE) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_H264_CAPABILITY_ROW_UNALIGNED_SLICE_BIT_KHR");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VideoEncodeH264CapabilityFlagsKHR() {}
}
