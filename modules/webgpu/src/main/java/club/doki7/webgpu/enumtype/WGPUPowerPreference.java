package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUPowerPreference {
    public static final int UNDEFINED = 0x0;
    public static final int LOW_POWER = 0x1;
    public static final int HIGH_PERFORMANCE = 0x2;

    public static String explain(@EnumType(WGPUPowerPreference.class) int value) {
        return switch (value) {
            case WGPUPowerPreference.HIGH_PERFORMANCE -> "HIGH_PERFORMANCE";
            case WGPUPowerPreference.LOW_POWER -> "LOW_POWER";
            case WGPUPowerPreference.UNDEFINED -> "UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUPowerPreference() {}
}
