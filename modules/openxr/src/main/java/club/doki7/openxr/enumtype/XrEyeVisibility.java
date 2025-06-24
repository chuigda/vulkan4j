package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrEyeVisibility.html"><code>XrEyeVisibility</code></a>
public final class XrEyeVisibility {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_EYE_VISIBILITY_BOTH.html"><code>XR_EYE_VISIBILITY_BOTH</code></a>
    public static final int BOTH = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_EYE_VISIBILITY_LEFT.html"><code>XR_EYE_VISIBILITY_LEFT</code></a>
    public static final int LEFT = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_EYE_VISIBILITY_RIGHT.html"><code>XR_EYE_VISIBILITY_RIGHT</code></a>
    public static final int RIGHT = 0x2;

    public static String explain(@EnumType(XrEyeVisibility.class) int value) {
        return switch (value) {
            case XrEyeVisibility.BOTH -> "XR_EYE_VISIBILITY_BOTH";
            case XrEyeVisibility.LEFT -> "XR_EYE_VISIBILITY_LEFT";
            case XrEyeVisibility.RIGHT -> "XR_EYE_VISIBILITY_RIGHT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrEyeVisibility() {}
}
