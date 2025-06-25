package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHandEXT.html"><code>XrHandEXT</code></a>
public final class XrHandEXT {
    public static final int LEFT = 0x1;
    public static final int RIGHT = 0x2;

    public static String explain(@EnumType(XrHandEXT.class) int value) {
        return switch (value) {
            case XrHandEXT.LEFT -> "XR_HAND_LEFT_EXT";
            case XrHandEXT.RIGHT -> "XR_HAND_RIGHT_EXT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrHandEXT() {}
}
