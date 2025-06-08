package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Possible connection states for a joystick device.
///
/// This is used by SDL_GetJoystickConnectionState to report how a device is
/// connected to the system.
///
/// \since This enum is available since SDL 3.2.0.
///
public final class SDL_JoystickConnectionState {
    public static final int SDL_JOYSTICK_CONNECTION_INVALID = 0xffffffff;
    public static final int SDL_JOYSTICK_CONNECTION_UNKNOWN = 0x1;
    public static final int SDL_JOYSTICK_CONNECTION_WIRED = 0x2;
    public static final int SDL_JOYSTICK_CONNECTION_WIRELESS = 0x3;

    public static String explain(@EnumType(SDL_JoystickConnectionState.class) int value) {
        return switch (value) {
            case SDL_JoystickConnectionState.SDL_JOYSTICK_CONNECTION_INVALID -> "SDL_JOYSTICK_CONNECTION_INVALID";
            case SDL_JoystickConnectionState.SDL_JOYSTICK_CONNECTION_UNKNOWN -> "SDL_JOYSTICK_CONNECTION_UNKNOWN";
            case SDL_JoystickConnectionState.SDL_JOYSTICK_CONNECTION_WIRED -> "SDL_JOYSTICK_CONNECTION_WIRED";
            case SDL_JoystickConnectionState.SDL_JOYSTICK_CONNECTION_WIRELESS -> "SDL_JOYSTICK_CONNECTION_WIRELESS";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_JoystickConnectionState() {}
}
