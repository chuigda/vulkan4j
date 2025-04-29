package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoCodecOperationFlagsKHR.html">VkVideoCodecOperationFlagsKHR</a>
public final class VkVideoCodecOperationFlagsKHR {
    public static final int VIDEO_CODEC_OPERATION_DECODE_AV1 = 0x4;
    public static final int VIDEO_CODEC_OPERATION_DECODE_H264 = 0x1;
    public static final int VIDEO_CODEC_OPERATION_DECODE_H265 = 0x2;
    public static final int VIDEO_CODEC_OPERATION_ENCODE_AV1 = 0x40000;
    public static final int VIDEO_CODEC_OPERATION_ENCODE_H264 = 0x10000;
    public static final int VIDEO_CODEC_OPERATION_ENCODE_H265 = 0x20000;
    public static final int VIDEO_CODEC_OPERATION_NONE = 0x0;

    public static String explain(@enumtype(VkVideoCodecOperationFlagsKHR.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & VIDEO_CODEC_OPERATION_DECODE_AV1) != 0) {
            detectedFlagBits.add("VK_VIDEO_CODEC_OPERATION_DECODE_AV1_BIT_KHR");
        }
        if ((flags & VIDEO_CODEC_OPERATION_DECODE_H264) != 0) {
            detectedFlagBits.add("VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR");
        }
        if ((flags & VIDEO_CODEC_OPERATION_DECODE_H265) != 0) {
            detectedFlagBits.add("VK_VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR");
        }
        if ((flags & VIDEO_CODEC_OPERATION_ENCODE_AV1) != 0) {
            detectedFlagBits.add("VK_VIDEO_CODEC_OPERATION_ENCODE_AV1_BIT_KHR");
        }
        if ((flags & VIDEO_CODEC_OPERATION_ENCODE_H264) != 0) {
            detectedFlagBits.add("VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR");
        }
        if ((flags & VIDEO_CODEC_OPERATION_ENCODE_H265) != 0) {
            detectedFlagBits.add("VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR");
        }
        if ((flags & VIDEO_CODEC_OPERATION_NONE) != 0) {
            detectedFlagBits.add("VK_VIDEO_CODEC_OPERATION_NONE_KHR");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkVideoCodecOperationFlagsKHR() {}
}
