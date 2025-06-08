package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Colorspace matrix coefficients.
///
/// These are as described by https://www.itu.int/rec/T-REC-H.273-201612-S/en
///
/// Since: This enum is available since SDL 3.2.0.
///
public final class SDL_MatrixCoefficients {
    public static final int IDENTITY = 0x0;
    public static final int BT709 = 0x1;
    public static final int UNSPECIFIED = 0x2;
    public static final int FCC = 0x4;
    public static final int BT470BG = 0x5;
    public static final int BT601 = 0x6;
    public static final int SMPTE240 = 0x7;
    public static final int YCGCO = 0x8;
    public static final int BT2020_NCL = 0x9;
    public static final int BT2020_CL = 0xa;
    public static final int SMPTE2085 = 0xb;
    public static final int CHROMA_DERIVED_NCL = 0xc;
    public static final int CHROMA_DERIVED_CL = 0xd;
    public static final int ICTCP = 0xe;
    public static final int CUSTOM = 0x1f;

    public static String explain(@EnumType(SDL_MatrixCoefficients.class) int value) {
        return switch (value) {
            case SDL_MatrixCoefficients.BT2020_CL -> "SDL_MATRIX_COEFFICIENTS_BT2020_CL";
            case SDL_MatrixCoefficients.BT2020_NCL -> "SDL_MATRIX_COEFFICIENTS_BT2020_NCL";
            case SDL_MatrixCoefficients.BT470BG -> "SDL_MATRIX_COEFFICIENTS_BT470BG";
            case SDL_MatrixCoefficients.BT601 -> "SDL_MATRIX_COEFFICIENTS_BT601";
            case SDL_MatrixCoefficients.BT709 -> "SDL_MATRIX_COEFFICIENTS_BT709";
            case SDL_MatrixCoefficients.CHROMA_DERIVED_CL -> "SDL_MATRIX_COEFFICIENTS_CHROMA_DERIVED_CL";
            case SDL_MatrixCoefficients.CHROMA_DERIVED_NCL -> "SDL_MATRIX_COEFFICIENTS_CHROMA_DERIVED_NCL";
            case SDL_MatrixCoefficients.CUSTOM -> "SDL_MATRIX_COEFFICIENTS_CUSTOM";
            case SDL_MatrixCoefficients.FCC -> "SDL_MATRIX_COEFFICIENTS_FCC";
            case SDL_MatrixCoefficients.ICTCP -> "SDL_MATRIX_COEFFICIENTS_ICTCP";
            case SDL_MatrixCoefficients.IDENTITY -> "SDL_MATRIX_COEFFICIENTS_IDENTITY";
            case SDL_MatrixCoefficients.SMPTE2085 -> "SDL_MATRIX_COEFFICIENTS_SMPTE2085";
            case SDL_MatrixCoefficients.SMPTE240 -> "SDL_MATRIX_COEFFICIENTS_SMPTE240";
            case SDL_MatrixCoefficients.UNSPECIFIED -> "SDL_MATRIX_COEFFICIENTS_UNSPECIFIED";
            case SDL_MatrixCoefficients.YCGCO -> "SDL_MATRIX_COEFFICIENTS_YCGCO";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_MatrixCoefficients() {}
}
