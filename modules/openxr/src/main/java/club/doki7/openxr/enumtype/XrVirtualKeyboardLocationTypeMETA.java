package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrVirtualKeyboardLocationTypeMETA.html"><code>XrVirtualKeyboardLocationTypeMETA</code></a>
public final class XrVirtualKeyboardLocationTypeMETA {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_VIRTUAL_KEYBOARD_LOCATION_TYPE_CUSTOM_META.html"><code>XR_VIRTUAL_KEYBOARD_LOCATION_TYPE_CUSTOM_META</code></a>
    public static final int CUSTOM = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_VIRTUAL_KEYBOARD_LOCATION_TYPE_FAR_META.html"><code>XR_VIRTUAL_KEYBOARD_LOCATION_TYPE_FAR_META</code></a>
    public static final int FAR = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_VIRTUAL_KEYBOARD_LOCATION_TYPE_DIRECT_META.html"><code>XR_VIRTUAL_KEYBOARD_LOCATION_TYPE_DIRECT_META</code></a>
    public static final int DIRECT = 0x2;

    public static String explain(@EnumType(XrVirtualKeyboardLocationTypeMETA.class) int value) {
        return switch (value) {
            case XrVirtualKeyboardLocationTypeMETA.CUSTOM -> "XR_VIRTUAL_KEYBOARD_LOCATION_TYPE_CUSTOM_META";
            case XrVirtualKeyboardLocationTypeMETA.DIRECT -> "XR_VIRTUAL_KEYBOARD_LOCATION_TYPE_DIRECT_META";
            case XrVirtualKeyboardLocationTypeMETA.FAR -> "XR_VIRTUAL_KEYBOARD_LOCATION_TYPE_FAR_META";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrVirtualKeyboardLocationTypeMETA() {}
}
