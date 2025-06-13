package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class ToneMappingMode {
    public static final int TONE_MAPPING_MODE_STANDARD = 0x1;
    public static final int TONE_MAPPING_MODE_EXTENDED = 0x2;
    public static final int TONE_MAPPING_MODE_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(ToneMappingMode.class) int value) {
        return switch (value) {
            case ToneMappingMode.TONE_MAPPING_MODE_EXTENDED -> "TONE_MAPPING_MODE_EXTENDED";
            case ToneMappingMode.TONE_MAPPING_MODE_FORCE32 -> "TONE_MAPPING_MODE_FORCE32";
            case ToneMappingMode.TONE_MAPPING_MODE_STANDARD -> "TONE_MAPPING_MODE_STANDARD";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private ToneMappingMode() {}
}
