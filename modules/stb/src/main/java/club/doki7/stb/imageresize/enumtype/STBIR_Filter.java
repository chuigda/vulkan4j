package club.doki7.stb.imageresize.enumtype;

import club.doki7.ffm.annotation.*;

public final class STBIR_Filter {
    public static final int DEFAULT = 0x0;
    public static final int BOX = 0x1;
    public static final int TRIANGLE = 0x2;
    public static final int CUBICBSPLINE = 0x3;
    public static final int CATMULLROM = 0x4;
    public static final int MITCHELL = 0x5;
    public static final int POINT_SAMPLE = 0x6;
    public static final int OTHER = 0x7;

    public static String explain(@EnumType(STBIR_Filter.class) int value) {
        return switch (value) {
            case STBIR_Filter.BOX -> "STBIR_FILTER_BOX";
            case STBIR_Filter.CATMULLROM -> "STBIR_FILTER_CATMULLROM";
            case STBIR_Filter.CUBICBSPLINE -> "STBIR_FILTER_CUBICBSPLINE";
            case STBIR_Filter.DEFAULT -> "STBIR_FILTER_DEFAULT";
            case STBIR_Filter.MITCHELL -> "STBIR_FILTER_MITCHELL";
            case STBIR_Filter.OTHER -> "STBIR_FILTER_OTHER";
            case STBIR_Filter.POINT_SAMPLE -> "STBIR_FILTER_POINT_SAMPLE";
            case STBIR_Filter.TRIANGLE -> "STBIR_FILTER_TRIANGLE";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private STBIR_Filter() {}
}
