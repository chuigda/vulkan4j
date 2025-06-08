package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// The current status of an SDL_InitState structure.
///
/// \since This enum is available since SDL 3.2.0.
///
public final class SDL_InitStatus {
    public static final int SDL_INIT_STATUS_UNINITIALIZED = 0x0;
    public static final int SDL_INIT_STATUS_INITIALIZING = 0x1;
    public static final int SDL_INIT_STATUS_INITIALIZED = 0x2;
    public static final int SDL_INIT_STATUS_UNINITIALIZING = 0x3;

    public static String explain(@EnumType(SDL_InitStatus.class) int value) {
        return switch (value) {
            case SDL_InitStatus.SDL_INIT_STATUS_INITIALIZED -> "SDL_INIT_STATUS_INITIALIZED";
            case SDL_InitStatus.SDL_INIT_STATUS_INITIALIZING -> "SDL_INIT_STATUS_INITIALIZING";
            case SDL_InitStatus.SDL_INIT_STATUS_UNINITIALIZED -> "SDL_INIT_STATUS_UNINITIALIZED";
            case SDL_InitStatus.SDL_INIT_STATUS_UNINITIALIZING -> "SDL_INIT_STATUS_UNINITIALIZING";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_InitStatus() {}
}
