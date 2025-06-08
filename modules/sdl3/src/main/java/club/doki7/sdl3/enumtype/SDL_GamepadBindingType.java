package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Types of gamepad control bindings.
///
/// A gamepad is a collection of bindings that map arbitrary joystick buttons,
/// axes and hat switches to specific positions on a generic console-style
/// gamepad. This enum is used as part of SDL_GamepadBinding to specify those
/// mappings.
///
/// \since This enum is available since SDL 3.2.0.
///
public final class SDL_GamepadBindingType {
    public static final int SDL_GAMEPAD_BINDTYPE_NONE = 0x0;
    public static final int SDL_GAMEPAD_BINDTYPE_BUTTON = 0x2;
    public static final int SDL_GAMEPAD_BINDTYPE_AXIS = 0x3;
    public static final int SDL_GAMEPAD_BINDTYPE_HAT = 0x4;

    public static String explain(@EnumType(SDL_GamepadBindingType.class) int value) {
        return switch (value) {
            case SDL_GamepadBindingType.SDL_GAMEPAD_BINDTYPE_AXIS -> "SDL_GAMEPAD_BINDTYPE_AXIS";
            case SDL_GamepadBindingType.SDL_GAMEPAD_BINDTYPE_BUTTON -> "SDL_GAMEPAD_BINDTYPE_BUTTON";
            case SDL_GamepadBindingType.SDL_GAMEPAD_BINDTYPE_HAT -> "SDL_GAMEPAD_BINDTYPE_HAT";
            case SDL_GamepadBindingType.SDL_GAMEPAD_BINDTYPE_NONE -> "SDL_GAMEPAD_BINDTYPE_NONE";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GamepadBindingType() {}
}
