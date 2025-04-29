package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/StdVideoH264PictureType.html">StdVideoH264PictureType</a>
public final class StdVideoH264PictureType {
    public static final int STD_VIDEO_H264_PICTURE_TYPE_P = 0;
    public static final int STD_VIDEO_H264_PICTURE_TYPE_B = 1;
    public static final int STD_VIDEO_H264_PICTURE_TYPE_I = 2;
    public static final int STD_VIDEO_H264_PICTURE_TYPE_IDR = 5;
    public static final int STD_VIDEO_H264_PICTURE_TYPE_INVALID = 2147483647;

    public static String explain(@enumtype(StdVideoH264PictureType.class) int value) {
        return switch (value) {
            case StdVideoH264PictureType.STD_VIDEO_H264_PICTURE_TYPE_B -> "STD_VIDEO_H264_PICTURE_TYPE_B";
            case StdVideoH264PictureType.STD_VIDEO_H264_PICTURE_TYPE_I -> "STD_VIDEO_H264_PICTURE_TYPE_I";
            case StdVideoH264PictureType.STD_VIDEO_H264_PICTURE_TYPE_IDR -> "STD_VIDEO_H264_PICTURE_TYPE_IDR";
            case StdVideoH264PictureType.STD_VIDEO_H264_PICTURE_TYPE_INVALID -> "STD_VIDEO_H264_PICTURE_TYPE_INVALID";
            case StdVideoH264PictureType.STD_VIDEO_H264_PICTURE_TYPE_P -> "STD_VIDEO_H264_PICTURE_TYPE_P";
            default -> "Unknown StdVideoH264PictureType: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private StdVideoH264PictureType() {}
}
