package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WgslLanguageFeatureName {
    public static final int READONLY_AND_READWRITE_STORAGE_TEXTURES = 0x1;
    public static final int PACKED4X8_INTEGER_DOT_PRODUCT = 0x2;
    public static final int UNRESTRICTED_POINTER_PARAMETERS = 0x3;
    public static final int POINTER_COMPOSITE_ACCESS = 0x4;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(WgslLanguageFeatureName.class) int value) {
        return switch (value) {
            case WgslLanguageFeatureName.FORCE32 -> "FORCE32";
            case WgslLanguageFeatureName.PACKED4X8_INTEGER_DOT_PRODUCT -> "PACKED4X8_INTEGER_DOT_PRODUCT";
            case WgslLanguageFeatureName.POINTER_COMPOSITE_ACCESS -> "POINTER_COMPOSITE_ACCESS";
            case WgslLanguageFeatureName.READONLY_AND_READWRITE_STORAGE_TEXTURES -> "READONLY_AND_READWRITE_STORAGE_TEXTURES";
            case WgslLanguageFeatureName.UNRESTRICTED_POINTER_PARAMETERS -> "UNRESTRICTED_POINTER_PARAMETERS";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WgslLanguageFeatureName() {}
}
