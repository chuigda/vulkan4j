package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Standard gamepad types.
///
/// This type does not necessarily map to first-party controllers from
/// Microsoft/Sony/Nintendo; in many cases, third-party controllers can report
/// as these, either because they were designed for a specific console, or they
/// simply most closely match that console's controllers (does it have A/B/X/Y
/// buttons or X/O/Square/Triangle? Does it have a touchpad? etc).
///
public final class SDL_GamepadType {
    public static final int SDL_GAMEPAD_TYPE_UNKNOWN = 0x0;
    public static final int SDL_GAMEPAD_TYPE_STANDARD = 0x2;
    public static final int SDL_GAMEPAD_TYPE_XBOX360 = 0x3;
    public static final int SDL_GAMEPAD_TYPE_XBOXONE = 0x4;
    public static final int SDL_GAMEPAD_TYPE_PS3 = 0x5;
    public static final int SDL_GAMEPAD_TYPE_PS4 = 0x6;
    public static final int SDL_GAMEPAD_TYPE_PS5 = 0x7;
    public static final int SDL_GAMEPAD_TYPE_NINTENDO_SWITCH_PRO = 0x8;
    public static final int SDL_GAMEPAD_TYPE_NINTENDO_SWITCH_JOYCON_LEFT = 0x9;
    public static final int SDL_GAMEPAD_TYPE_NINTENDO_SWITCH_JOYCON_RIGHT = 0xa;
    public static final int SDL_GAMEPAD_TYPE_NINTENDO_SWITCH_JOYCON_PAIR = 0xb;
    public static final int SDL_GAMEPAD_TYPE_COUNT = 0xc;

    public static String explain(@EnumType(SDL_GamepadType.class) int value) {
        return switch (value) {
            case SDL_GamepadType.SDL_GAMEPAD_TYPE_COUNT -> "SDL_GAMEPAD_TYPE_COUNT";
            case SDL_GamepadType.SDL_GAMEPAD_TYPE_NINTENDO_SWITCH_JOYCON_LEFT -> "SDL_GAMEPAD_TYPE_NINTENDO_SWITCH_JOYCON_LEFT";
            case SDL_GamepadType.SDL_GAMEPAD_TYPE_NINTENDO_SWITCH_JOYCON_PAIR -> "SDL_GAMEPAD_TYPE_NINTENDO_SWITCH_JOYCON_PAIR";
            case SDL_GamepadType.SDL_GAMEPAD_TYPE_NINTENDO_SWITCH_JOYCON_RIGHT -> "SDL_GAMEPAD_TYPE_NINTENDO_SWITCH_JOYCON_RIGHT";
            case SDL_GamepadType.SDL_GAMEPAD_TYPE_NINTENDO_SWITCH_PRO -> "SDL_GAMEPAD_TYPE_NINTENDO_SWITCH_PRO";
            case SDL_GamepadType.SDL_GAMEPAD_TYPE_PS3 -> "SDL_GAMEPAD_TYPE_PS3";
            case SDL_GamepadType.SDL_GAMEPAD_TYPE_PS4 -> "SDL_GAMEPAD_TYPE_PS4";
            case SDL_GamepadType.SDL_GAMEPAD_TYPE_PS5 -> "SDL_GAMEPAD_TYPE_PS5";
            case SDL_GamepadType.SDL_GAMEPAD_TYPE_STANDARD -> "SDL_GAMEPAD_TYPE_STANDARD";
            case SDL_GamepadType.SDL_GAMEPAD_TYPE_UNKNOWN -> "SDL_GAMEPAD_TYPE_UNKNOWN";
            case SDL_GamepadType.SDL_GAMEPAD_TYPE_XBOX360 -> "SDL_GAMEPAD_TYPE_XBOX360";
            case SDL_GamepadType.SDL_GAMEPAD_TYPE_XBOXONE -> "SDL_GAMEPAD_TYPE_XBOXONE";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GamepadType() {}
}
