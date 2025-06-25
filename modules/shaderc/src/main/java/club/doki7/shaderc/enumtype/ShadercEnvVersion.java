package club.doki7.shaderc.enumtype;

import club.doki7.ffm.annotation.*;

public final class ShadercEnvVersion {
    public static final int VULKAN_1_0 = 0x400000;
    public static final int VULKAN_1_1 = 0x401000;
    public static final int VULKAN_1_2 = 0x402000;
    public static final int VULKAN_1_3 = 0x403000;
    public static final int VULKAN_1_4 = 0x404000;
    public static final int OPENGL_4_5 = 0x1c2;

    public static String explain(@EnumType(ShadercEnvVersion.class) int value) {
        return switch (value) {
            case ShadercEnvVersion.OPENGL_4_5 -> "shaderc_env_version_opengl_4_5";
            case ShadercEnvVersion.VULKAN_1_0 -> "shaderc_env_version_vulkan_1_0";
            case ShadercEnvVersion.VULKAN_1_1 -> "shaderc_env_version_vulkan_1_1";
            case ShadercEnvVersion.VULKAN_1_2 -> "shaderc_env_version_vulkan_1_2";
            case ShadercEnvVersion.VULKAN_1_3 -> "shaderc_env_version_vulkan_1_3";
            case ShadercEnvVersion.VULKAN_1_4 -> "shaderc_env_version_vulkan_1_4";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private ShadercEnvVersion() {}
}
