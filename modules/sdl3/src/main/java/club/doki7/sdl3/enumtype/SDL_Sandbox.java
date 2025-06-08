package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Application sandbox environment.
///
/// \since This enum is available since SDL 3.2.0.
///
public final class SDL_Sandbox {
    public static final int SDL_SANDBOX_NONE = 0x0;
    public static final int SDL_SANDBOX_UNKNOWN_CONTAINER = 0x2;
    public static final int SDL_SANDBOX_FLATPAK = 0x3;
    public static final int SDL_SANDBOX_SNAP = 0x4;
    public static final int SDL_SANDBOX_MACOS = 0x5;

    public static String explain(@EnumType(SDL_Sandbox.class) int value) {
        return switch (value) {
            case SDL_Sandbox.SDL_SANDBOX_FLATPAK -> "SDL_SANDBOX_FLATPAK";
            case SDL_Sandbox.SDL_SANDBOX_MACOS -> "SDL_SANDBOX_MACOS";
            case SDL_Sandbox.SDL_SANDBOX_NONE -> "SDL_SANDBOX_NONE";
            case SDL_Sandbox.SDL_SANDBOX_SNAP -> "SDL_SANDBOX_SNAP";
            case SDL_Sandbox.SDL_SANDBOX_UNKNOWN_CONTAINER -> "SDL_SANDBOX_UNKNOWN_CONTAINER";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_Sandbox() {}
}
