package club.doki7.shaderc.enumtype;

import club.doki7.ffm.annotation.*;

public final class ShadercIncludeType {
    public static final int RELATIVE = 0x0;
    public static final int STANDARD = 0x1;

    public static String explain(@EnumType(ShadercIncludeType.class) int value) {
        return switch (value) {
            case ShadercIncludeType.RELATIVE -> "shaderc_include_type_relative";
            case ShadercIncludeType.STANDARD -> "shaderc_include_type_standard";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private ShadercIncludeType() {}
}
