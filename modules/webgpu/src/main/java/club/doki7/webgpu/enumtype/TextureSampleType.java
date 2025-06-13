package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class TextureSampleType {
    public static final int TEXTURE_SAMPLE_TYPE_BINDING_NOT_USED = 0x0;
    public static final int TEXTURE_SAMPLE_TYPE_UNDEFINED = 0x1;
    public static final int TEXTURE_SAMPLE_TYPE_FLOAT = 0x2;
    public static final int TEXTURE_SAMPLE_TYPE_UNFILTERABLE_FLOAT = 0x3;
    public static final int TEXTURE_SAMPLE_TYPE_DEPTH = 0x4;
    public static final int TEXTURE_SAMPLE_TYPE_SINT = 0x5;
    public static final int TEXTURE_SAMPLE_TYPE_UINT = 0x6;
    public static final int TEXTURE_SAMPLE_TYPE_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(TextureSampleType.class) int value) {
        return switch (value) {
            case TextureSampleType.TEXTURE_SAMPLE_TYPE_BINDING_NOT_USED -> "TEXTURE_SAMPLE_TYPE_BINDING_NOT_USED";
            case TextureSampleType.TEXTURE_SAMPLE_TYPE_DEPTH -> "TEXTURE_SAMPLE_TYPE_DEPTH";
            case TextureSampleType.TEXTURE_SAMPLE_TYPE_FLOAT -> "TEXTURE_SAMPLE_TYPE_FLOAT";
            case TextureSampleType.TEXTURE_SAMPLE_TYPE_FORCE32 -> "TEXTURE_SAMPLE_TYPE_FORCE32";
            case TextureSampleType.TEXTURE_SAMPLE_TYPE_SINT -> "TEXTURE_SAMPLE_TYPE_SINT";
            case TextureSampleType.TEXTURE_SAMPLE_TYPE_UINT -> "TEXTURE_SAMPLE_TYPE_UINT";
            case TextureSampleType.TEXTURE_SAMPLE_TYPE_UNDEFINED -> "TEXTURE_SAMPLE_TYPE_UNDEFINED";
            case TextureSampleType.TEXTURE_SAMPLE_TYPE_UNFILTERABLE_FLOAT -> "TEXTURE_SAMPLE_TYPE_UNFILTERABLE_FLOAT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private TextureSampleType() {}
}
