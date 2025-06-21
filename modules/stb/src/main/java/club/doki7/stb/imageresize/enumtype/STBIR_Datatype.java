package club.doki7.stb.imageresize.enumtype;

import club.doki7.ffm.annotation.*;

public final class STBIR_Datatype {
    public static final int UINT8 = 0x0;
    public static final int UINT8_SRGB = 0x1;
    public static final int UINT8_SRGB_ALPHA = 0x2;
    public static final int UINT16 = 0x3;
    public static final int FLOAT = 0x4;
    public static final int HALF_FLOAT = 0x5;

    public static String explain(@EnumType(STBIR_Datatype.class) int value) {
        return switch (value) {
            case STBIR_Datatype.FLOAT -> "STBIR_TYPE_FLOAT";
            case STBIR_Datatype.HALF_FLOAT -> "STBIR_TYPE_HALF_FLOAT";
            case STBIR_Datatype.UINT16 -> "STBIR_TYPE_UINT16";
            case STBIR_Datatype.UINT8 -> "STBIR_TYPE_UINT8";
            case STBIR_Datatype.UINT8_SRGB -> "STBIR_TYPE_UINT8_SRGB";
            case STBIR_Datatype.UINT8_SRGB_ALPHA -> "STBIR_TYPE_UINT8_SRGB_ALPHA";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private STBIR_Datatype() {}
}
