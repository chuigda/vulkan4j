package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class PowerPreference {
    public static final int POWER_PREFERENCE_UNDEFINED = 0x0;
    public static final int POWER_PREFERENCE_LOW_POWER = 0x1;
    public static final int POWER_PREFERENCE_HIGH_PERFORMANCE = 0x2;
    public static final int POWER_PREFERENCE_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(PowerPreference.class) int value) {
        return switch (value) {
            case PowerPreference.POWER_PREFERENCE_FORCE32 -> "POWER_PREFERENCE_FORCE32";
            case PowerPreference.POWER_PREFERENCE_HIGH_PERFORMANCE -> "POWER_PREFERENCE_HIGH_PERFORMANCE";
            case PowerPreference.POWER_PREFERENCE_LOW_POWER -> "POWER_PREFERENCE_LOW_POWER";
            case PowerPreference.POWER_PREFERENCE_UNDEFINED -> "POWER_PREFERENCE_UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private PowerPreference() {}
}
