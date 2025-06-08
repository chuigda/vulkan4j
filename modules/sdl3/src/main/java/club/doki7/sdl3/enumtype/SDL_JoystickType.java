package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// An enum of some common joystick types.
///
/// In some cases, SDL can identify a low-level joystick as being a certain
/// type of device, and will report it through SDL_GetJoystickType (or
/// SDL_GetJoystickTypeForID).
///
/// This is by no means a complete list of everything that can be plugged into
/// a computer.
///
/// \since This enum is available since SDL 3.2.0.
///
public final class SDL_JoystickType {
    public static final int SDL_JOYSTICK_TYPE_UNKNOWN = 0x0;
    public static final int SDL_JOYSTICK_TYPE_GAMEPAD = 0x1;
    public static final int SDL_JOYSTICK_TYPE_WHEEL = 0x2;
    public static final int SDL_JOYSTICK_TYPE_ARCADE_STICK = 0x3;
    public static final int SDL_JOYSTICK_TYPE_FLIGHT_STICK = 0x4;
    public static final int SDL_JOYSTICK_TYPE_DANCE_PAD = 0x5;
    public static final int SDL_JOYSTICK_TYPE_GUITAR = 0x6;
    public static final int SDL_JOYSTICK_TYPE_DRUM_KIT = 0x7;
    public static final int SDL_JOYSTICK_TYPE_ARCADE_PAD = 0x8;
    public static final int SDL_JOYSTICK_TYPE_THROTTLE = 0x9;
    public static final int SDL_JOYSTICK_TYPE_COUNT = 0xa;

    public static String explain(@EnumType(SDL_JoystickType.class) int value) {
        return switch (value) {
            case SDL_JoystickType.SDL_JOYSTICK_TYPE_ARCADE_PAD -> "SDL_JOYSTICK_TYPE_ARCADE_PAD";
            case SDL_JoystickType.SDL_JOYSTICK_TYPE_ARCADE_STICK -> "SDL_JOYSTICK_TYPE_ARCADE_STICK";
            case SDL_JoystickType.SDL_JOYSTICK_TYPE_COUNT -> "SDL_JOYSTICK_TYPE_COUNT";
            case SDL_JoystickType.SDL_JOYSTICK_TYPE_DANCE_PAD -> "SDL_JOYSTICK_TYPE_DANCE_PAD";
            case SDL_JoystickType.SDL_JOYSTICK_TYPE_DRUM_KIT -> "SDL_JOYSTICK_TYPE_DRUM_KIT";
            case SDL_JoystickType.SDL_JOYSTICK_TYPE_FLIGHT_STICK -> "SDL_JOYSTICK_TYPE_FLIGHT_STICK";
            case SDL_JoystickType.SDL_JOYSTICK_TYPE_GAMEPAD -> "SDL_JOYSTICK_TYPE_GAMEPAD";
            case SDL_JoystickType.SDL_JOYSTICK_TYPE_GUITAR -> "SDL_JOYSTICK_TYPE_GUITAR";
            case SDL_JoystickType.SDL_JOYSTICK_TYPE_THROTTLE -> "SDL_JOYSTICK_TYPE_THROTTLE";
            case SDL_JoystickType.SDL_JOYSTICK_TYPE_UNKNOWN -> "SDL_JOYSTICK_TYPE_UNKNOWN";
            case SDL_JoystickType.SDL_JOYSTICK_TYPE_WHEEL -> "SDL_JOYSTICK_TYPE_WHEEL";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_JoystickType() {}
}
