package club.doki7.shaderc.enumtype;

import club.doki7.ffm.annotation.*;

public final class ShadercSourceLanguage {
    public static final int GLSL = 0x0;
    public static final int HLSL = 0x1;

    public static String explain(@EnumType(ShadercSourceLanguage.class) int value) {
        return switch (value) {
            case ShadercSourceLanguage.GLSL -> "shaderc_source_language_glsl";
            case ShadercSourceLanguage.HLSL -> "shaderc_source_language_hlsl";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private ShadercSourceLanguage() {}
}
