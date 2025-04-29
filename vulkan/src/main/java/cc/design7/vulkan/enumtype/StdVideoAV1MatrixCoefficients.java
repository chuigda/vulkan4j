package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/StdVideoAV1MatrixCoefficients.html">StdVideoAV1MatrixCoefficients</a>
public final class StdVideoAV1MatrixCoefficients {
    public static final int STD_VIDEO_AV1_MATRIX_COEFFICIENTS_IDENTITY = 0;
    public static final int STD_VIDEO_AV1_MATRIX_COEFFICIENTS_BT_709 = 1;
    public static final int STD_VIDEO_AV1_MATRIX_COEFFICIENTS_UNSPECIFIED = 2;
    public static final int STD_VIDEO_AV1_MATRIX_COEFFICIENTS_RESERVED_3 = 3;
    public static final int STD_VIDEO_AV1_MATRIX_COEFFICIENTS_FCC = 4;
    public static final int STD_VIDEO_AV1_MATRIX_COEFFICIENTS_BT_470_B_G = 5;
    public static final int STD_VIDEO_AV1_MATRIX_COEFFICIENTS_BT_601 = 6;
    public static final int STD_VIDEO_AV1_MATRIX_COEFFICIENTS_SMPTE_240 = 7;
    public static final int STD_VIDEO_AV1_MATRIX_COEFFICIENTS_SMPTE_YCGCO = 8;
    public static final int STD_VIDEO_AV1_MATRIX_COEFFICIENTS_BT_2020_NCL = 9;
    public static final int STD_VIDEO_AV1_MATRIX_COEFFICIENTS_BT_2020_CL = 10;
    public static final int STD_VIDEO_AV1_MATRIX_COEFFICIENTS_SMPTE_2085 = 11;
    public static final int STD_VIDEO_AV1_MATRIX_COEFFICIENTS_CHROMAT_NCL = 12;
    public static final int STD_VIDEO_AV1_MATRIX_COEFFICIENTS_CHROMAT_CL = 13;
    public static final int STD_VIDEO_AV1_MATRIX_COEFFICIENTS_ICTCP = 14;
    public static final int STD_VIDEO_AV1_MATRIX_COEFFICIENTS_INVALID = 2147483647;

    public static String explain(@enumtype(StdVideoAV1MatrixCoefficients.class) int value) {
        return switch (value) {
            case StdVideoAV1MatrixCoefficients.STD_VIDEO_AV1_MATRIX_COEFFICIENTS_BT_2020_CL -> "STD_VIDEO_AV1_MATRIX_COEFFICIENTS_BT_2020_CL";
            case StdVideoAV1MatrixCoefficients.STD_VIDEO_AV1_MATRIX_COEFFICIENTS_BT_2020_NCL -> "STD_VIDEO_AV1_MATRIX_COEFFICIENTS_BT_2020_NCL";
            case StdVideoAV1MatrixCoefficients.STD_VIDEO_AV1_MATRIX_COEFFICIENTS_BT_470_B_G -> "STD_VIDEO_AV1_MATRIX_COEFFICIENTS_BT_470_B_G";
            case StdVideoAV1MatrixCoefficients.STD_VIDEO_AV1_MATRIX_COEFFICIENTS_BT_601 -> "STD_VIDEO_AV1_MATRIX_COEFFICIENTS_BT_601";
            case StdVideoAV1MatrixCoefficients.STD_VIDEO_AV1_MATRIX_COEFFICIENTS_BT_709 -> "STD_VIDEO_AV1_MATRIX_COEFFICIENTS_BT_709";
            case StdVideoAV1MatrixCoefficients.STD_VIDEO_AV1_MATRIX_COEFFICIENTS_CHROMAT_CL -> "STD_VIDEO_AV1_MATRIX_COEFFICIENTS_CHROMAT_CL";
            case StdVideoAV1MatrixCoefficients.STD_VIDEO_AV1_MATRIX_COEFFICIENTS_CHROMAT_NCL -> "STD_VIDEO_AV1_MATRIX_COEFFICIENTS_CHROMAT_NCL";
            case StdVideoAV1MatrixCoefficients.STD_VIDEO_AV1_MATRIX_COEFFICIENTS_FCC -> "STD_VIDEO_AV1_MATRIX_COEFFICIENTS_FCC";
            case StdVideoAV1MatrixCoefficients.STD_VIDEO_AV1_MATRIX_COEFFICIENTS_ICTCP -> "STD_VIDEO_AV1_MATRIX_COEFFICIENTS_ICTCP";
            case StdVideoAV1MatrixCoefficients.STD_VIDEO_AV1_MATRIX_COEFFICIENTS_IDENTITY -> "STD_VIDEO_AV1_MATRIX_COEFFICIENTS_IDENTITY";
            case StdVideoAV1MatrixCoefficients.STD_VIDEO_AV1_MATRIX_COEFFICIENTS_INVALID -> "STD_VIDEO_AV1_MATRIX_COEFFICIENTS_INVALID";
            case StdVideoAV1MatrixCoefficients.STD_VIDEO_AV1_MATRIX_COEFFICIENTS_RESERVED_3 -> "STD_VIDEO_AV1_MATRIX_COEFFICIENTS_RESERVED_3";
            case StdVideoAV1MatrixCoefficients.STD_VIDEO_AV1_MATRIX_COEFFICIENTS_SMPTE_2085 -> "STD_VIDEO_AV1_MATRIX_COEFFICIENTS_SMPTE_2085";
            case StdVideoAV1MatrixCoefficients.STD_VIDEO_AV1_MATRIX_COEFFICIENTS_SMPTE_240 -> "STD_VIDEO_AV1_MATRIX_COEFFICIENTS_SMPTE_240";
            case StdVideoAV1MatrixCoefficients.STD_VIDEO_AV1_MATRIX_COEFFICIENTS_SMPTE_YCGCO -> "STD_VIDEO_AV1_MATRIX_COEFFICIENTS_SMPTE_YCGCO";
            case StdVideoAV1MatrixCoefficients.STD_VIDEO_AV1_MATRIX_COEFFICIENTS_UNSPECIFIED -> "STD_VIDEO_AV1_MATRIX_COEFFICIENTS_UNSPECIFIED";
            default -> "Unknown StdVideoAV1MatrixCoefficients: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private StdVideoAV1MatrixCoefficients() {}
}
