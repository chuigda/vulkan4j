package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPerfSettingsNotificationLevelEXT.html"><code>XrPerfSettingsNotificationLevelEXT</code></a>
public final class XrPerfSettingsNotificationLevelEXT {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_PERF_SETTINGS_NOTIF_LEVEL_NORMAL_EXT.html"><code>XR_PERF_SETTINGS_NOTIF_LEVEL_NORMAL_EXT</code></a>
    public static final int XR_PERF_SETTINGS_NOTIF_LEVEL_NORMAL = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_PERF_SETTINGS_NOTIF_LEVEL_WARNING_EXT.html"><code>XR_PERF_SETTINGS_NOTIF_LEVEL_WARNING_EXT</code></a>
    public static final int XR_PERF_SETTINGS_NOTIF_LEVEL_WARNING = 0x19;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_PERF_SETTINGS_NOTIF_LEVEL_IMPAIRED_EXT.html"><code>XR_PERF_SETTINGS_NOTIF_LEVEL_IMPAIRED_EXT</code></a>
    public static final int XR_PERF_SETTINGS_NOTIF_LEVEL_IMPAIRED = 0x4b;

    public static String explain(@EnumType(XrPerfSettingsNotificationLevelEXT.class) int value) {
        return switch (value) {
            case XrPerfSettingsNotificationLevelEXT.XR_PERF_SETTINGS_NOTIF_LEVEL_IMPAIRED -> "XR_PERF_SETTINGS_NOTIF_LEVEL_IMPAIRED_EXT";
            case XrPerfSettingsNotificationLevelEXT.XR_PERF_SETTINGS_NOTIF_LEVEL_NORMAL -> "XR_PERF_SETTINGS_NOTIF_LEVEL_NORMAL_EXT";
            case XrPerfSettingsNotificationLevelEXT.XR_PERF_SETTINGS_NOTIF_LEVEL_WARNING -> "XR_PERF_SETTINGS_NOTIF_LEVEL_WARNING_EXT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrPerfSettingsNotificationLevelEXT() {}
}
