package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/StdVideoAV1ReferenceName.html">StdVideoAV1ReferenceName</a>
public final class StdVideoAV1ReferenceName {
    public static final int STD_VIDEO_AV1_REFERENCE_NAME_INTRA_FRAME = 0;
    public static final int STD_VIDEO_AV1_REFERENCE_NAME_LAST_FRAME = 1;
    public static final int STD_VIDEO_AV1_REFERENCE_NAME_LAST2_FRAME = 2;
    public static final int STD_VIDEO_AV1_REFERENCE_NAME_LAST3_FRAME = 3;
    public static final int STD_VIDEO_AV1_REFERENCE_NAME_GOLDEN_FRAME = 4;
    public static final int STD_VIDEO_AV1_REFERENCE_NAME_BWDREF_FRAME = 5;
    public static final int STD_VIDEO_AV1_REFERENCE_NAME_ALTREF2_FRAME = 6;
    public static final int STD_VIDEO_AV1_REFERENCE_NAME_ALTREF_FRAME = 7;
    public static final int STD_VIDEO_AV1_REFERENCE_NAME_INVALID = 2147483647;

    public static String explain(@enumtype(StdVideoAV1ReferenceName.class) int value) {
        return switch (value) {
            case StdVideoAV1ReferenceName.STD_VIDEO_AV1_REFERENCE_NAME_ALTREF2_FRAME -> "STD_VIDEO_AV1_REFERENCE_NAME_ALTREF2_FRAME";
            case StdVideoAV1ReferenceName.STD_VIDEO_AV1_REFERENCE_NAME_ALTREF_FRAME -> "STD_VIDEO_AV1_REFERENCE_NAME_ALTREF_FRAME";
            case StdVideoAV1ReferenceName.STD_VIDEO_AV1_REFERENCE_NAME_BWDREF_FRAME -> "STD_VIDEO_AV1_REFERENCE_NAME_BWDREF_FRAME";
            case StdVideoAV1ReferenceName.STD_VIDEO_AV1_REFERENCE_NAME_GOLDEN_FRAME -> "STD_VIDEO_AV1_REFERENCE_NAME_GOLDEN_FRAME";
            case StdVideoAV1ReferenceName.STD_VIDEO_AV1_REFERENCE_NAME_INTRA_FRAME -> "STD_VIDEO_AV1_REFERENCE_NAME_INTRA_FRAME";
            case StdVideoAV1ReferenceName.STD_VIDEO_AV1_REFERENCE_NAME_INVALID -> "STD_VIDEO_AV1_REFERENCE_NAME_INVALID";
            case StdVideoAV1ReferenceName.STD_VIDEO_AV1_REFERENCE_NAME_LAST2_FRAME -> "STD_VIDEO_AV1_REFERENCE_NAME_LAST2_FRAME";
            case StdVideoAV1ReferenceName.STD_VIDEO_AV1_REFERENCE_NAME_LAST3_FRAME -> "STD_VIDEO_AV1_REFERENCE_NAME_LAST3_FRAME";
            case StdVideoAV1ReferenceName.STD_VIDEO_AV1_REFERENCE_NAME_LAST_FRAME -> "STD_VIDEO_AV1_REFERENCE_NAME_LAST_FRAME";
            default -> "Unknown StdVideoAV1ReferenceName: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private StdVideoAV1ReferenceName() {}
}
