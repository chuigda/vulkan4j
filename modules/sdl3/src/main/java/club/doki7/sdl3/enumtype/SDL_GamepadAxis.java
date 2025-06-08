package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// The list of axes available on a gamepad
///
/// Thumbstick axis values range from SDL_JOYSTICK_AXIS_MIN to
/// SDL_JOYSTICK_AXIS_MAX, and are centered within ~8000 of zero, though
/// advanced UI will allow users to set or autodetect the dead zone, which
/// varies between gamepads.
///
/// Trigger axis values range from 0 (released) to SDL_JOYSTICK_AXIS_MAX (fully
/// pressed) when reported by SDL_GetGamepadAxis(). Note that this is not the
/// same range that will be reported by the lower-level SDL_GetJoystickAxis().
///
/// Since: This enum is available since SDL 3.2.0.
///
public final class SDL_GamepadAxis {
    public static final int INVALID = 0xffffffff;
    public static final int LEFTX = 0x1;
    public static final int LEFTY = 0x2;
    public static final int RIGHTX = 0x3;
    public static final int RIGHTY = 0x4;
    public static final int LEFT_TRIGGER = 0x5;
    public static final int RIGHT_TRIGGER = 0x6;
    public static final int COUNT = 0x7;

    public static String explain(@EnumType(SDL_GamepadAxis.class) int value) {
        return switch (value) {
            case SDL_GamepadAxis.COUNT -> "SDL_GAMEPAD_AXIS_COUNT";
            case SDL_GamepadAxis.INVALID -> "SDL_GAMEPAD_AXIS_INVALID";
            case SDL_GamepadAxis.LEFTX -> "SDL_GAMEPAD_AXIS_LEFTX";
            case SDL_GamepadAxis.LEFTY -> "SDL_GAMEPAD_AXIS_LEFTY";
            case SDL_GamepadAxis.LEFT_TRIGGER -> "SDL_GAMEPAD_AXIS_LEFT_TRIGGER";
            case SDL_GamepadAxis.RIGHTX -> "SDL_GAMEPAD_AXIS_RIGHTX";
            case SDL_GamepadAxis.RIGHTY -> "SDL_GAMEPAD_AXIS_RIGHTY";
            case SDL_GamepadAxis.RIGHT_TRIGGER -> "SDL_GAMEPAD_AXIS_RIGHT_TRIGGER";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GamepadAxis() {}
}
