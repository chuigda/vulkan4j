package club.doki7.shaderc.enumtype;

import club.doki7.ffm.annotation.*;

public final class ShadercSpirvVersion {
    public static final int VERSION_1_0 = 0x10000;
    public static final int VERSION_1_1 = 0x10100;
    public static final int VERSION_1_2 = 0x10200;
    public static final int VERSION_1_3 = 0x10300;
    public static final int VERSION_1_4 = 0x10400;
    public static final int VERSION_1_5 = 0x10500;
    public static final int VERSION_1_6 = 0x10600;

    public static String explain(@EnumType(ShadercSpirvVersion.class) int value) {
        return switch (value) {
            case ShadercSpirvVersion.VERSION_1_0 -> "shaderc_spirv_version_1_0";
            case ShadercSpirvVersion.VERSION_1_1 -> "shaderc_spirv_version_1_1";
            case ShadercSpirvVersion.VERSION_1_2 -> "shaderc_spirv_version_1_2";
            case ShadercSpirvVersion.VERSION_1_3 -> "shaderc_spirv_version_1_3";
            case ShadercSpirvVersion.VERSION_1_4 -> "shaderc_spirv_version_1_4";
            case ShadercSpirvVersion.VERSION_1_5 -> "shaderc_spirv_version_1_5";
            case ShadercSpirvVersion.VERSION_1_6 -> "shaderc_spirv_version_1_6";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private ShadercSpirvVersion() {}
}
