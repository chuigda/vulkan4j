package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUTextureSampleType {
    public static final int BINDING_NOT_USED = 0x0;
    public static final int UNDEFINED = 0x1;
    public static final int FLOAT = 0x2;
    public static final int UNFILTERABLE_FLOAT = 0x3;
    public static final int DEPTH = 0x4;
    public static final int SINT = 0x5;
    public static final int UINT = 0x6;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(WGPUTextureSampleType.class) int value) {
        return switch (value) {
            case WGPUTextureSampleType.BINDING_NOT_USED -> "BINDING_NOT_USED";
            case WGPUTextureSampleType.DEPTH -> "DEPTH";
            case WGPUTextureSampleType.FLOAT -> "FLOAT";
            case WGPUTextureSampleType.FORCE32 -> "FORCE32";
            case WGPUTextureSampleType.SINT -> "SINT";
            case WGPUTextureSampleType.UINT -> "UINT";
            case WGPUTextureSampleType.UNDEFINED -> "UNDEFINED";
            case WGPUTextureSampleType.UNFILTERABLE_FLOAT -> "UNFILTERABLE_FLOAT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUTextureSampleType() {}
}
