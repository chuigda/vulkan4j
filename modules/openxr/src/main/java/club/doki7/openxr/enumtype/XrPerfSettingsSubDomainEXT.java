package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPerfSettingsSubDomainEXT.html"><code>XrPerfSettingsSubDomainEXT</code></a>
public final class XrPerfSettingsSubDomainEXT {
    public static final int COMPOSITING = 0x1;
    public static final int RENDERING = 0x2;
    public static final int THERMAL = 0x3;

    public static String explain(@EnumType(XrPerfSettingsSubDomainEXT.class) int value) {
        return switch (value) {
            case XrPerfSettingsSubDomainEXT.COMPOSITING -> "XR_PERF_SETTINGS_SUB_DOMAIN_COMPOSITING_EXT";
            case XrPerfSettingsSubDomainEXT.RENDERING -> "XR_PERF_SETTINGS_SUB_DOMAIN_RENDERING_EXT";
            case XrPerfSettingsSubDomainEXT.THERMAL -> "XR_PERF_SETTINGS_SUB_DOMAIN_THERMAL_EXT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrPerfSettingsSubDomainEXT() {}
}
