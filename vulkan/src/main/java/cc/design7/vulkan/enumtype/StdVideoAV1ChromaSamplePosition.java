package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/StdVideoAV1ChromaSamplePosition.html">StdVideoAV1ChromaSamplePosition</a>
public final class StdVideoAV1ChromaSamplePosition {
    public static final int STD_VIDEO_AV1_CHROMA_SAMPLE_POSITION_UNKNOWN = 0;
    public static final int STD_VIDEO_AV1_CHROMA_SAMPLE_POSITION_VERTICAL = 1;
    public static final int STD_VIDEO_AV1_CHROMA_SAMPLE_POSITION_COLOCATED = 2;
    public static final int STD_VIDEO_AV1_CHROMA_SAMPLE_POSITION_RESERVED = 3;
    public static final int STD_VIDEO_AV1_CHROMA_SAMPLE_POSITION_INVALID = 2147483647;

    public static String explain(@enumtype(StdVideoAV1ChromaSamplePosition.class) int value) {
        return switch (value) {
            case StdVideoAV1ChromaSamplePosition.STD_VIDEO_AV1_CHROMA_SAMPLE_POSITION_COLOCATED -> "STD_VIDEO_AV1_CHROMA_SAMPLE_POSITION_COLOCATED";
            case StdVideoAV1ChromaSamplePosition.STD_VIDEO_AV1_CHROMA_SAMPLE_POSITION_INVALID -> "STD_VIDEO_AV1_CHROMA_SAMPLE_POSITION_INVALID";
            case StdVideoAV1ChromaSamplePosition.STD_VIDEO_AV1_CHROMA_SAMPLE_POSITION_RESERVED -> "STD_VIDEO_AV1_CHROMA_SAMPLE_POSITION_RESERVED";
            case StdVideoAV1ChromaSamplePosition.STD_VIDEO_AV1_CHROMA_SAMPLE_POSITION_UNKNOWN -> "STD_VIDEO_AV1_CHROMA_SAMPLE_POSITION_UNKNOWN";
            case StdVideoAV1ChromaSamplePosition.STD_VIDEO_AV1_CHROMA_SAMPLE_POSITION_VERTICAL -> "STD_VIDEO_AV1_CHROMA_SAMPLE_POSITION_VERTICAL";
            default -> "Unknown StdVideoAV1ChromaSamplePosition: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private StdVideoAV1ChromaSamplePosition() {}
}
