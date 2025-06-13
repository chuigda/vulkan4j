package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class PredefinedColorSpace {
    public static final int PREDEFINED_COLOR_SPACE_SRGB = 0x1;
    public static final int PREDEFINED_COLOR_SPACE_DISPLAY_P3 = 0x2;
    public static final int PREDEFINED_COLOR_SPACE_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(PredefinedColorSpace.class) int value) {
        return switch (value) {
            case PredefinedColorSpace.PREDEFINED_COLOR_SPACE_DISPLAY_P3 -> "PREDEFINED_COLOR_SPACE_DISPLAY_P3";
            case PredefinedColorSpace.PREDEFINED_COLOR_SPACE_FORCE32 -> "PREDEFINED_COLOR_SPACE_FORCE32";
            case PredefinedColorSpace.PREDEFINED_COLOR_SPACE_SRGB -> "PREDEFINED_COLOR_SPACE_SRGB";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private PredefinedColorSpace() {}
}
