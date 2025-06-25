package club.doki7.shaderc.enumtype;

import club.doki7.ffm.annotation.*;

public final class ShadercTargetEnv {
    public static final int VULKAN = 0x0;
    public static final int OPENGL = 0x1;
    public static final int OPENGL_COMPAT = 0x2;
    public static final int WEBGPU = 0x3;
    public static final int DEFAULT = VULKAN;

    public static String explain(@EnumType(ShadercTargetEnv.class) int value) {
        return switch (value) {
            case ShadercTargetEnv.OPENGL -> "shaderc_target_env_opengl";
            case ShadercTargetEnv.OPENGL_COMPAT -> "shaderc_target_env_opengl_compat";
            case ShadercTargetEnv.VULKAN -> "shaderc_target_env_vulkan";
            case ShadercTargetEnv.WEBGPU -> "shaderc_target_env_webgpu";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private ShadercTargetEnv() {}
}
