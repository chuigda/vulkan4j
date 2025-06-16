package club.doki7.shaderc.enumtype;

import club.doki7.ffm.annotation.*;

public final class ShadercProfile {
    public static final int NONE = 0x0;
    public static final int CORE = 0x1;
    public static final int COMPATIBILITY = 0x2;
    public static final int ES = 0x3;

    public static String explain(@EnumType(ShadercProfile.class) int value) {
        return switch (value) {
            case ShadercProfile.COMPATIBILITY -> "shaderc_profile_compatibility";
            case ShadercProfile.CORE -> "shaderc_profile_core";
            case ShadercProfile.ES -> "shaderc_profile_es";
            case ShadercProfile.NONE -> "shaderc_profile_none";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private ShadercProfile() {}
}
