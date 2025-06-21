package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class PowerPreference {
    public static final int UNDEFINED = 0x0;
    public static final int LOW_POWER = 0x1;
    public static final int HIGH_PERFORMANCE = 0x2;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(PowerPreference.class) int value) {
        return switch (value) {
            case PowerPreference.FORCE32 -> "FORCE32";
            case PowerPreference.HIGH_PERFORMANCE -> "HIGH_PERFORMANCE";
            case PowerPreference.LOW_POWER -> "LOW_POWER";
            case PowerPreference.UNDEFINED -> "UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private PowerPreference() {}
}
