package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class MipmapFilterMode {
    public static final int MIPMAP_FILTER_MODE_UNDEFINED = 0x0;
    public static final int MIPMAP_FILTER_MODE_NEAREST = 0x1;
    public static final int MIPMAP_FILTER_MODE_LINEAR = 0x2;
    public static final int MIPMAP_FILTER_MODE_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(MipmapFilterMode.class) int value) {
        return switch (value) {
            case MipmapFilterMode.MIPMAP_FILTER_MODE_FORCE32 -> "MIPMAP_FILTER_MODE_FORCE32";
            case MipmapFilterMode.MIPMAP_FILTER_MODE_LINEAR -> "MIPMAP_FILTER_MODE_LINEAR";
            case MipmapFilterMode.MIPMAP_FILTER_MODE_NEAREST -> "MIPMAP_FILTER_MODE_NEAREST";
            case MipmapFilterMode.MIPMAP_FILTER_MODE_UNDEFINED -> "MIPMAP_FILTER_MODE_UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private MipmapFilterMode() {}
}
