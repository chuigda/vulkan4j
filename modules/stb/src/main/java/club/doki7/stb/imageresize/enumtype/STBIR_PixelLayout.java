package club.doki7.stb.imageresize.enumtype;

import club.doki7.ffm.annotation.*;

public final class STBIR_PixelLayout {
    public static final int _1CHANNEL = 0x1;
    public static final int _2CHANNEL = 0x2;
    public static final int RGB = 0x3;
    public static final int BGR = 0x0;
    public static final int _4CHANNEL = 0x5;
    public static final int RGBA = 0x4;
    public static final int BGRA = 0x6;
    public static final int ARGB = 0x7;
    public static final int ABGR = 0x8;
    public static final int RA = 0x9;
    public static final int AR = 0xa;
    public static final int RGBA_PM = 0xb;
    public static final int BGRA_PM = 0xc;
    public static final int ARGB_PM = 0xd;
    public static final int ABGR_PM = 0xe;
    public static final int RA_PM = 0xf;
    public static final int AR_PM = 0x10;
    public static final int RGBA_NO_AW = 0xb;
    public static final int BGRA_NO_AW = 0xc;
    public static final int ARGB_NO_AW = 0xd;
    public static final int ABGR_NO_AW = 0xe;
    public static final int RA_NO_AW = 0xf;
    public static final int AR_NO_AW = 0x10;

    public static String explain(@EnumType(STBIR_PixelLayout.class) int value) {
        return switch (value) {
            case STBIR_PixelLayout._1CHANNEL -> "STBIR_1CHANNEL";
            case STBIR_PixelLayout._2CHANNEL -> "STBIR_2CHANNEL";
            case STBIR_PixelLayout._4CHANNEL -> "STBIR_4CHANNEL";
            case STBIR_PixelLayout.ABGR -> "STBIR_ABGR";
            case STBIR_PixelLayout.ABGR_PM -> "STBIR_ABGR_PM";
            case STBIR_PixelLayout.AR -> "STBIR_AR";
            case STBIR_PixelLayout.ARGB -> "STBIR_ARGB";
            case STBIR_PixelLayout.ARGB_PM -> "STBIR_ARGB_PM";
            case STBIR_PixelLayout.AR_PM -> "STBIR_AR_PM";
            case STBIR_PixelLayout.BGR -> "STBIR_BGR";
            case STBIR_PixelLayout.BGRA -> "STBIR_BGRA";
            case STBIR_PixelLayout.BGRA_PM -> "STBIR_BGRA_PM";
            case STBIR_PixelLayout.RA -> "STBIR_RA";
            case STBIR_PixelLayout.RA_PM -> "STBIR_RA_PM";
            case STBIR_PixelLayout.RGB -> "STBIR_RGB";
            case STBIR_PixelLayout.RGBA -> "STBIR_RGBA";
            case STBIR_PixelLayout.RGBA_PM -> "STBIR_RGBA_PM";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private STBIR_PixelLayout() {}
}
