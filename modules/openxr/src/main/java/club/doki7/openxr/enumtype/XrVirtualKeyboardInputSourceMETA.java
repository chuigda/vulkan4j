package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrVirtualKeyboardInputSourceMETA.html"><code>XrVirtualKeyboardInputSourceMETA</code></a>
public final class XrVirtualKeyboardInputSourceMETA {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_RAY_LEFT_META.html"><code>XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_RAY_LEFT_META</code></a>
    public static final int CONTROLLER_RAY_LEFT = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_RAY_RIGHT_META.html"><code>XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_RAY_RIGHT_META</code></a>
    public static final int CONTROLLER_RAY_RIGHT = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_RAY_LEFT_META.html"><code>XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_RAY_LEFT_META</code></a>
    public static final int HAND_RAY_LEFT = 0x3;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_RAY_RIGHT_META.html"><code>XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_RAY_RIGHT_META</code></a>
    public static final int HAND_RAY_RIGHT = 0x4;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_DIRECT_LEFT_META.html"><code>XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_DIRECT_LEFT_META</code></a>
    public static final int CONTROLLER_DIRECT_LEFT = 0x5;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_DIRECT_RIGHT_META.html"><code>XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_DIRECT_RIGHT_META</code></a>
    public static final int CONTROLLER_DIRECT_RIGHT = 0x6;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_DIRECT_INDEX_TIP_LEFT_META.html"><code>XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_DIRECT_INDEX_TIP_LEFT_META</code></a>
    public static final int HAND_DIRECT_INDEX_TIP_LEFT = 0x7;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_DIRECT_INDEX_TIP_RIGHT_META.html"><code>XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_DIRECT_INDEX_TIP_RIGHT_META</code></a>
    public static final int HAND_DIRECT_INDEX_TIP_RIGHT = 0x8;

    public static String explain(@EnumType(XrVirtualKeyboardInputSourceMETA.class) int value) {
        return switch (value) {
            case XrVirtualKeyboardInputSourceMETA.CONTROLLER_DIRECT_LEFT -> "XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_DIRECT_LEFT_META";
            case XrVirtualKeyboardInputSourceMETA.CONTROLLER_DIRECT_RIGHT -> "XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_DIRECT_RIGHT_META";
            case XrVirtualKeyboardInputSourceMETA.CONTROLLER_RAY_LEFT -> "XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_RAY_LEFT_META";
            case XrVirtualKeyboardInputSourceMETA.CONTROLLER_RAY_RIGHT -> "XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_CONTROLLER_RAY_RIGHT_META";
            case XrVirtualKeyboardInputSourceMETA.HAND_DIRECT_INDEX_TIP_LEFT -> "XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_DIRECT_INDEX_TIP_LEFT_META";
            case XrVirtualKeyboardInputSourceMETA.HAND_DIRECT_INDEX_TIP_RIGHT -> "XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_DIRECT_INDEX_TIP_RIGHT_META";
            case XrVirtualKeyboardInputSourceMETA.HAND_RAY_LEFT -> "XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_RAY_LEFT_META";
            case XrVirtualKeyboardInputSourceMETA.HAND_RAY_RIGHT -> "XR_VIRTUAL_KEYBOARD_INPUT_SOURCE_HAND_RAY_RIGHT_META";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrVirtualKeyboardInputSourceMETA() {}
}
