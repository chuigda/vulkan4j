package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUWgslLanguageFeatureName {
    public static final int READONLY_AND_READWRITE_STORAGE_TEXTURES = 0x1;
    public static final int PACKED4X8_INTEGER_DOT_PRODUCT = 0x2;
    public static final int UNRESTRICTED_POINTER_PARAMETERS = 0x3;
    public static final int POINTER_COMPOSITE_ACCESS = 0x4;

    public static String explain(@EnumType(WGPUWgslLanguageFeatureName.class) int value) {
        return switch (value) {
            case WGPUWgslLanguageFeatureName.PACKED4X8_INTEGER_DOT_PRODUCT -> "PACKED4X8_INTEGER_DOT_PRODUCT";
            case WGPUWgslLanguageFeatureName.POINTER_COMPOSITE_ACCESS -> "POINTER_COMPOSITE_ACCESS";
            case WGPUWgslLanguageFeatureName.READONLY_AND_READWRITE_STORAGE_TEXTURES -> "READONLY_AND_READWRITE_STORAGE_TEXTURES";
            case WGPUWgslLanguageFeatureName.UNRESTRICTED_POINTER_PARAMETERS -> "UNRESTRICTED_POINTER_PARAMETERS";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUWgslLanguageFeatureName() {}
}
