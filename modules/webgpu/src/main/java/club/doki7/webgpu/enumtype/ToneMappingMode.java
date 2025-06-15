package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class ToneMappingMode {
    public static final int STANDARD = 0x1;
    public static final int EXTENDED = 0x2;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(ToneMappingMode.class) int value) {
        return switch (value) {
            case ToneMappingMode.EXTENDED -> "EXTENDED";
            case ToneMappingMode.FORCE32 -> "FORCE32";
            case ToneMappingMode.STANDARD -> "STANDARD";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private ToneMappingMode() {}
}
