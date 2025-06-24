package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrLocalDimmingModeMETA.html"><code>XrLocalDimmingModeMETA</code></a>
public final class XrLocalDimmingModeMETA {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_LOCAL_DIMMING_MODE_OFF_META.html"><code>XR_LOCAL_DIMMING_MODE_OFF_META</code></a>
    public static final int OFF = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_LOCAL_DIMMING_MODE_ON_META.html"><code>XR_LOCAL_DIMMING_MODE_ON_META</code></a>
    public static final int ON = 0x1;

    public static String explain(@EnumType(XrLocalDimmingModeMETA.class) int value) {
        return switch (value) {
            case XrLocalDimmingModeMETA.OFF -> "XR_LOCAL_DIMMING_MODE_OFF_META";
            case XrLocalDimmingModeMETA.ON -> "XR_LOCAL_DIMMING_MODE_ON_META";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrLocalDimmingModeMETA() {}
}
