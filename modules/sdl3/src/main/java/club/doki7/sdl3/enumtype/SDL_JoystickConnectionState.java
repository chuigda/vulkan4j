package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Possible connection states for a joystick device.
///
/// This is used by SDL_GetJoystickConnectionState to report how a device is
/// connected to the system.
///
/// Since: This enum is available since SDL 3.2.0.
///
public final class SDL_JoystickConnectionState {
    public static final int INVALID = 0xffffffff;
    public static final int UNKNOWN = 0x1;
    public static final int WIRED = 0x2;
    public static final int WIRELESS = 0x3;

    public static String explain(@EnumType(SDL_JoystickConnectionState.class) int value) {
        return switch (value) {
            case SDL_JoystickConnectionState.INVALID -> "SDL_JOYSTICK_CONNECTION_INVALID";
            case SDL_JoystickConnectionState.UNKNOWN -> "SDL_JOYSTICK_CONNECTION_UNKNOWN";
            case SDL_JoystickConnectionState.WIRED -> "SDL_JOYSTICK_CONNECTION_WIRED";
            case SDL_JoystickConnectionState.WIRELESS -> "SDL_JOYSTICK_CONNECTION_WIRELESS";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_JoystickConnectionState() {}
}
