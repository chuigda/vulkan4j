package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFoveationLevelFB.html"><code>XrFoveationLevelFB</code></a>
public final class XrFoveationLevelFB {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_FOVEATION_LEVEL_NONE_FB.html"><code>XR_FOVEATION_LEVEL_NONE_FB</code></a>
    public static final int NONE = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_FOVEATION_LEVEL_LOW_FB.html"><code>XR_FOVEATION_LEVEL_LOW_FB</code></a>
    public static final int LOW = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_FOVEATION_LEVEL_MEDIUM_FB.html"><code>XR_FOVEATION_LEVEL_MEDIUM_FB</code></a>
    public static final int MEDIUM = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_FOVEATION_LEVEL_HIGH_FB.html"><code>XR_FOVEATION_LEVEL_HIGH_FB</code></a>
    public static final int HIGH = 0x3;

    public static String explain(@EnumType(XrFoveationLevelFB.class) int value) {
        return switch (value) {
            case XrFoveationLevelFB.HIGH -> "XR_FOVEATION_LEVEL_HIGH_FB";
            case XrFoveationLevelFB.LOW -> "XR_FOVEATION_LEVEL_LOW_FB";
            case XrFoveationLevelFB.MEDIUM -> "XR_FOVEATION_LEVEL_MEDIUM_FB";
            case XrFoveationLevelFB.NONE -> "XR_FOVEATION_LEVEL_NONE_FB";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrFoveationLevelFB() {}
}
