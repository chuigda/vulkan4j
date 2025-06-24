package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFoveationLevelHTC.html"><code>XrFoveationLevelHTC</code></a>
public final class XrFoveationLevelHTC {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_FOVEATION_LEVEL_NONE_HTC.html"><code>XR_FOVEATION_LEVEL_NONE_HTC</code></a>
    public static final int NONE = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_FOVEATION_LEVEL_LOW_HTC.html"><code>XR_FOVEATION_LEVEL_LOW_HTC</code></a>
    public static final int LOW = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_FOVEATION_LEVEL_MEDIUM_HTC.html"><code>XR_FOVEATION_LEVEL_MEDIUM_HTC</code></a>
    public static final int MEDIUM = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_FOVEATION_LEVEL_HIGH_HTC.html"><code>XR_FOVEATION_LEVEL_HIGH_HTC</code></a>
    public static final int HIGH = 0x3;

    public static String explain(@EnumType(XrFoveationLevelHTC.class) int value) {
        return switch (value) {
            case XrFoveationLevelHTC.HIGH -> "XR_FOVEATION_LEVEL_HIGH_HTC";
            case XrFoveationLevelHTC.LOW -> "XR_FOVEATION_LEVEL_LOW_HTC";
            case XrFoveationLevelHTC.MEDIUM -> "XR_FOVEATION_LEVEL_MEDIUM_HTC";
            case XrFoveationLevelHTC.NONE -> "XR_FOVEATION_LEVEL_NONE_HTC";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrFoveationLevelHTC() {}
}
