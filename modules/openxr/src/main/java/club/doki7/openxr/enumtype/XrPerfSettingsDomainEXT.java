package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPerfSettingsDomainEXT.html"><code>XrPerfSettingsDomainEXT</code></a>
public final class XrPerfSettingsDomainEXT {
    public static final int CPU = 0x1;
    public static final int GPU = 0x2;

    public static String explain(@EnumType(XrPerfSettingsDomainEXT.class) int value) {
        return switch (value) {
            case XrPerfSettingsDomainEXT.CPU -> "XR_PERF_SETTINGS_DOMAIN_CPU_EXT";
            case XrPerfSettingsDomainEXT.GPU -> "XR_PERF_SETTINGS_DOMAIN_GPU_EXT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrPerfSettingsDomainEXT() {}
}
