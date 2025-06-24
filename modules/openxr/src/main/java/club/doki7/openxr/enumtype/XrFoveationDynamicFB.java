package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFoveationDynamicFB.html"><code>XrFoveationDynamicFB</code></a>
public final class XrFoveationDynamicFB {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_FOVEATION_DYNAMIC_DISABLED_FB.html"><code>XR_FOVEATION_DYNAMIC_DISABLED_FB</code></a>
    public static final int DISABLED = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_FOVEATION_DYNAMIC_LEVEL_ENABLED_FB.html"><code>XR_FOVEATION_DYNAMIC_LEVEL_ENABLED_FB</code></a>
    public static final int LEVEL_ENABLED = 0x1;

    public static String explain(@EnumType(XrFoveationDynamicFB.class) int value) {
        return switch (value) {
            case XrFoveationDynamicFB.DISABLED -> "XR_FOVEATION_DYNAMIC_DISABLED_FB";
            case XrFoveationDynamicFB.LEVEL_ENABLED -> "XR_FOVEATION_DYNAMIC_LEVEL_ENABLED_FB";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrFoveationDynamicFB() {}
}
