package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Return values for optional main callbacks.
///
/// Returning SDL_APP_SUCCESS or SDL_APP_FAILURE from SDL_AppInit,
/// SDL_AppEvent, or SDL_AppIterate will terminate the program and report
/// success/failure to the operating system. What that means is
/// platform-dependent. On Unix, for example, on success, the process error
/// code will be zero, and on failure it will be 1. This interface doesn't
/// allow you to return specific exit codes, just whether there was an error
/// generally or not.
///
/// Returning SDL_APP_CONTINUE from these functions will let the app continue
/// to run.
///
/// See
/// [Main callbacks in SDL3](https://wiki.libsdl.org/SDL3/README/main-functions{@code main}-callbacks-in-sdl3)
/// for complete details.
///
/// Since: This enum is available since SDL 3.2.0.
///
public final class SDL_AppResult {
    public static final int CONTINUE = 0x0;
    public static final int SUCCESS = 0x1;
    public static final int FAILURE = 0x2;

    public static String explain(@EnumType(SDL_AppResult.class) int value) {
        return switch (value) {
            case SDL_AppResult.CONTINUE -> "SDL_APP_CONTINUE";
            case SDL_AppResult.FAILURE -> "SDL_APP_FAILURE";
            case SDL_AppResult.SUCCESS -> "SDL_APP_SUCCESS";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_AppResult() {}
}
