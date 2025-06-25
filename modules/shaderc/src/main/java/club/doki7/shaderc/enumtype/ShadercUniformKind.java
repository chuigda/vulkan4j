package club.doki7.shaderc.enumtype;

import club.doki7.ffm.annotation.*;

public final class ShadercUniformKind {
    public static final int IMAGE = 0x0;
    public static final int SAMPLER = 0x1;
    public static final int TEXTURE = 0x2;
    public static final int BUFFER = 0x3;
    public static final int STORAGE_BUFFER = 0x4;
    public static final int UNORDERED_ACCESS_VIEW = 0x5;

    public static String explain(@EnumType(ShadercUniformKind.class) int value) {
        return switch (value) {
            case ShadercUniformKind.BUFFER -> "shaderc_uniform_kind_buffer";
            case ShadercUniformKind.IMAGE -> "shaderc_uniform_kind_image";
            case ShadercUniformKind.SAMPLER -> "shaderc_uniform_kind_sampler";
            case ShadercUniformKind.STORAGE_BUFFER -> "shaderc_uniform_kind_storage_buffer";
            case ShadercUniformKind.TEXTURE -> "shaderc_uniform_kind_texture";
            case ShadercUniformKind.UNORDERED_ACCESS_VIEW -> "shaderc_uniform_kind_unordered_access_view";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private ShadercUniformKind() {}
}
