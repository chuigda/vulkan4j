package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// The basic state for the system's power supply.
///
/// These are results returned by SDL_GetPowerInfo().
///
/// \since This enum is available since SDL 3.2.0.
///
public final class SDL_PowerState {
    public static final int SDL_POWERSTATE_ERROR = 0xffffffff;
    public static final int SDL_POWERSTATE_UNKNOWN = 0x1;
    public static final int SDL_POWERSTATE_ON_BATTERY = 0x2;
    public static final int SDL_POWERSTATE_NO_BATTERY = 0x3;
    public static final int SDL_POWERSTATE_CHARGING = 0x4;
    public static final int SDL_POWERSTATE_CHARGED = 0x5;

    public static String explain(@EnumType(SDL_PowerState.class) int value) {
        return switch (value) {
            case SDL_PowerState.SDL_POWERSTATE_CHARGED -> "SDL_POWERSTATE_CHARGED";
            case SDL_PowerState.SDL_POWERSTATE_CHARGING -> "SDL_POWERSTATE_CHARGING";
            case SDL_PowerState.SDL_POWERSTATE_ERROR -> "SDL_POWERSTATE_ERROR";
            case SDL_PowerState.SDL_POWERSTATE_NO_BATTERY -> "SDL_POWERSTATE_NO_BATTERY";
            case SDL_PowerState.SDL_POWERSTATE_ON_BATTERY -> "SDL_POWERSTATE_ON_BATTERY";
            case SDL_PowerState.SDL_POWERSTATE_UNKNOWN -> "SDL_POWERSTATE_UNKNOWN";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_PowerState() {}
}
