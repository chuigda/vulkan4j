package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/StdVideoAV1FrameRestorationType.html">StdVideoAV1FrameRestorationType</a>
public final class StdVideoAV1FrameRestorationType {
    public static final int STD_VIDEO_AV1_FRAME_RESTORATION_TYPE_NONE = 0x0;
    public static final int STD_VIDEO_AV1_FRAME_RESTORATION_TYPE_WIENER = 0x1;
    public static final int STD_VIDEO_AV1_FRAME_RESTORATION_TYPE_SGRPROJ = 0x2;
    public static final int STD_VIDEO_AV1_FRAME_RESTORATION_TYPE_SWITCHABLE = 0x3;
    public static final int STD_VIDEO_AV1_FRAME_RESTORATION_TYPE_INVALID = 0x7fffffff;

    public static String explain(@enumtype(StdVideoAV1FrameRestorationType.class) int value) {
        return switch (value) {
            case StdVideoAV1FrameRestorationType.STD_VIDEO_AV1_FRAME_RESTORATION_TYPE_INVALID -> "STD_VIDEO_AV1_FRAME_RESTORATION_TYPE_INVALID";
            case StdVideoAV1FrameRestorationType.STD_VIDEO_AV1_FRAME_RESTORATION_TYPE_NONE -> "STD_VIDEO_AV1_FRAME_RESTORATION_TYPE_NONE";
            case StdVideoAV1FrameRestorationType.STD_VIDEO_AV1_FRAME_RESTORATION_TYPE_SGRPROJ -> "STD_VIDEO_AV1_FRAME_RESTORATION_TYPE_SGRPROJ";
            case StdVideoAV1FrameRestorationType.STD_VIDEO_AV1_FRAME_RESTORATION_TYPE_SWITCHABLE -> "STD_VIDEO_AV1_FRAME_RESTORATION_TYPE_SWITCHABLE";
            case StdVideoAV1FrameRestorationType.STD_VIDEO_AV1_FRAME_RESTORATION_TYPE_WIENER -> "STD_VIDEO_AV1_FRAME_RESTORATION_TYPE_WIENER";
            default -> "Unknown StdVideoAV1FrameRestorationType: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private StdVideoAV1FrameRestorationType() {}
}
