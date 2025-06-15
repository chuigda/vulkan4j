package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class TextureSampleType {
    public static final int BINDING_NOT_USED = 0x0;
    public static final int UNDEFINED = 0x1;
    public static final int FLOAT = 0x2;
    public static final int UNFILTERABLE_FLOAT = 0x3;
    public static final int DEPTH = 0x4;
    public static final int SINT = 0x5;
    public static final int UINT = 0x6;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(TextureSampleType.class) int value) {
        return switch (value) {
            case TextureSampleType.BINDING_NOT_USED -> "BINDING_NOT_USED";
            case TextureSampleType.DEPTH -> "DEPTH";
            case TextureSampleType.FLOAT -> "FLOAT";
            case TextureSampleType.FORCE32 -> "FORCE32";
            case TextureSampleType.SINT -> "SINT";
            case TextureSampleType.UINT -> "UINT";
            case TextureSampleType.UNDEFINED -> "UNDEFINED";
            case TextureSampleType.UNFILTERABLE_FLOAT -> "UNFILTERABLE_FLOAT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private TextureSampleType() {}
}
