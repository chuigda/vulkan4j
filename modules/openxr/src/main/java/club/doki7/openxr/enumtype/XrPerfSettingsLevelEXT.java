package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPerfSettingsLevelEXT.html"><code>XrPerfSettingsLevelEXT</code></a>
public final class XrPerfSettingsLevelEXT {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_PERF_SETTINGS_LEVEL_POWER_SAVINGS_EXT.html"><code>XR_PERF_SETTINGS_LEVEL_POWER_SAVINGS_EXT</code></a>
    public static final int POWER_SAVINGS = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_PERF_SETTINGS_LEVEL_SUSTAINED_LOW_EXT.html"><code>XR_PERF_SETTINGS_LEVEL_SUSTAINED_LOW_EXT</code></a>
    public static final int SUSTAINED_LOW = 0x19;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_PERF_SETTINGS_LEVEL_SUSTAINED_HIGH_EXT.html"><code>XR_PERF_SETTINGS_LEVEL_SUSTAINED_HIGH_EXT</code></a>
    public static final int SUSTAINED_HIGH = 0x32;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_PERF_SETTINGS_LEVEL_BOOST_EXT.html"><code>XR_PERF_SETTINGS_LEVEL_BOOST_EXT</code></a>
    public static final int BOOST = 0x4b;

    public static String explain(@EnumType(XrPerfSettingsLevelEXT.class) int value) {
        return switch (value) {
            case XrPerfSettingsLevelEXT.BOOST -> "XR_PERF_SETTINGS_LEVEL_BOOST_EXT";
            case XrPerfSettingsLevelEXT.POWER_SAVINGS -> "XR_PERF_SETTINGS_LEVEL_POWER_SAVINGS_EXT";
            case XrPerfSettingsLevelEXT.SUSTAINED_HIGH -> "XR_PERF_SETTINGS_LEVEL_SUSTAINED_HIGH_EXT";
            case XrPerfSettingsLevelEXT.SUSTAINED_LOW -> "XR_PERF_SETTINGS_LEVEL_SUSTAINED_LOW_EXT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrPerfSettingsLevelEXT() {}
}
