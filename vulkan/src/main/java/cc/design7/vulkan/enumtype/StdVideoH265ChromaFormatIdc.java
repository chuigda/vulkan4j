package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/StdVideoH265ChromaFormatIdc.html">StdVideoH265ChromaFormatIdc</a>
public final class StdVideoH265ChromaFormatIdc {
    public static final int STD_VIDEO_H265_CHROMA_FORMAT_IDC_MONOCHROME = 0x0;
    public static final int STD_VIDEO_H265_CHROMA_FORMAT_IDC_420 = 0x1;
    public static final int STD_VIDEO_H265_CHROMA_FORMAT_IDC_422 = 0x2;
    public static final int STD_VIDEO_H265_CHROMA_FORMAT_IDC_444 = 0x3;
    public static final int STD_VIDEO_H265_CHROMA_FORMAT_IDC_INVALID = 0x7fffffff;

    public static String explain(@enumtype(StdVideoH265ChromaFormatIdc.class) int value) {
        return switch (value) {
            case StdVideoH265ChromaFormatIdc.STD_VIDEO_H265_CHROMA_FORMAT_IDC_420 -> "STD_VIDEO_H265_CHROMA_FORMAT_IDC_420";
            case StdVideoH265ChromaFormatIdc.STD_VIDEO_H265_CHROMA_FORMAT_IDC_422 -> "STD_VIDEO_H265_CHROMA_FORMAT_IDC_422";
            case StdVideoH265ChromaFormatIdc.STD_VIDEO_H265_CHROMA_FORMAT_IDC_444 -> "STD_VIDEO_H265_CHROMA_FORMAT_IDC_444";
            case StdVideoH265ChromaFormatIdc.STD_VIDEO_H265_CHROMA_FORMAT_IDC_INVALID -> "STD_VIDEO_H265_CHROMA_FORMAT_IDC_INVALID";
            case StdVideoH265ChromaFormatIdc.STD_VIDEO_H265_CHROMA_FORMAT_IDC_MONOCHROME -> "STD_VIDEO_H265_CHROMA_FORMAT_IDC_MONOCHROME";
            default -> "Unknown StdVideoH265ChromaFormatIdc: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private StdVideoH265ChromaFormatIdc() {}
}
