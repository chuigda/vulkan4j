package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class PredefinedColorSpace {
    public static final int SRGB = 0x1;
    public static final int DISPLAY_P3 = 0x2;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(PredefinedColorSpace.class) int value) {
        return switch (value) {
            case PredefinedColorSpace.DISPLAY_P3 -> "DISPLAY_P3";
            case PredefinedColorSpace.FORCE32 -> "FORCE32";
            case PredefinedColorSpace.SRGB -> "SRGB";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private PredefinedColorSpace() {}
}
