package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/StdVideoAV1FrameType.html">StdVideoAV1FrameType</a>
public final class StdVideoAV1FrameType {
    public static final int STD_VIDEO_AV1_FRAME_TYPE_KEY = 0;
    public static final int STD_VIDEO_AV1_FRAME_TYPE_INTER = 1;
    public static final int STD_VIDEO_AV1_FRAME_TYPE_INTRA_ONLY = 2;
    public static final int STD_VIDEO_AV1_FRAME_TYPE_SWITCH = 3;
    public static final int STD_VIDEO_AV1_FRAME_TYPE_INVALID = 2147483647;

    public static String explain(@enumtype(StdVideoAV1FrameType.class) int value) {
        return switch (value) {
            case StdVideoAV1FrameType.STD_VIDEO_AV1_FRAME_TYPE_INTER -> "STD_VIDEO_AV1_FRAME_TYPE_INTER";
            case StdVideoAV1FrameType.STD_VIDEO_AV1_FRAME_TYPE_INTRA_ONLY -> "STD_VIDEO_AV1_FRAME_TYPE_INTRA_ONLY";
            case StdVideoAV1FrameType.STD_VIDEO_AV1_FRAME_TYPE_INVALID -> "STD_VIDEO_AV1_FRAME_TYPE_INVALID";
            case StdVideoAV1FrameType.STD_VIDEO_AV1_FRAME_TYPE_KEY -> "STD_VIDEO_AV1_FRAME_TYPE_KEY";
            case StdVideoAV1FrameType.STD_VIDEO_AV1_FRAME_TYPE_SWITCH -> "STD_VIDEO_AV1_FRAME_TYPE_SWITCH";
            default -> "Unknown StdVideoAV1FrameType: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private StdVideoAV1FrameType() {}
}
