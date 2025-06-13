package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WgslLanguageFeatureName {
    public static final int WGSL_LANGUAGE_FEATURE_NAME_READONLY_AND_READWRITE_STORAGE_TEXTURES = 0x1;
    public static final int WGSL_LANGUAGE_FEATURE_NAME_PACKED4X8_INTEGER_DOT_PRODUCT = 0x2;
    public static final int WGSL_LANGUAGE_FEATURE_NAME_UNRESTRICTED_POINTER_PARAMETERS = 0x3;
    public static final int WGSL_LANGUAGE_FEATURE_NAME_POINTER_COMPOSITE_ACCESS = 0x4;
    public static final int WGSL_LANGUAGE_FEATURE_NAME_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(WgslLanguageFeatureName.class) int value) {
        return switch (value) {
            case WgslLanguageFeatureName.WGSL_LANGUAGE_FEATURE_NAME_FORCE32 -> "WGSL_LANGUAGE_FEATURE_NAME_FORCE32";
            case WgslLanguageFeatureName.WGSL_LANGUAGE_FEATURE_NAME_PACKED4X8_INTEGER_DOT_PRODUCT -> "WGSL_LANGUAGE_FEATURE_NAME_PACKED4X8_INTEGER_DOT_PRODUCT";
            case WgslLanguageFeatureName.WGSL_LANGUAGE_FEATURE_NAME_POINTER_COMPOSITE_ACCESS -> "WGSL_LANGUAGE_FEATURE_NAME_POINTER_COMPOSITE_ACCESS";
            case WgslLanguageFeatureName.WGSL_LANGUAGE_FEATURE_NAME_READONLY_AND_READWRITE_STORAGE_TEXTURES -> "WGSL_LANGUAGE_FEATURE_NAME_READONLY_AND_READWRITE_STORAGE_TEXTURES";
            case WgslLanguageFeatureName.WGSL_LANGUAGE_FEATURE_NAME_UNRESTRICTED_POINTER_PARAMETERS -> "WGSL_LANGUAGE_FEATURE_NAME_UNRESTRICTED_POINTER_PARAMETERS";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WgslLanguageFeatureName() {}
}
