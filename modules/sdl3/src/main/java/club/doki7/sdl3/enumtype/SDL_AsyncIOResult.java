package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Possible outcomes of an asynchronous I/O task.
///
/// \since This enum is available since SDL 3.2.0.
///
public final class SDL_AsyncIOResult {
    public static final int SDL_ASYNCIO_COMPLETE = 0x0;
    public static final int SDL_ASYNCIO_FAILURE = 0x1;
    public static final int SDL_ASYNCIO_CANCELED = 0x2;

    public static String explain(@EnumType(SDL_AsyncIOResult.class) int value) {
        return switch (value) {
            case SDL_AsyncIOResult.SDL_ASYNCIO_CANCELED -> "SDL_ASYNCIO_CANCELED";
            case SDL_AsyncIOResult.SDL_ASYNCIO_COMPLETE -> "SDL_ASYNCIO_COMPLETE";
            case SDL_AsyncIOResult.SDL_ASYNCIO_FAILURE -> "SDL_ASYNCIO_FAILURE";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_AsyncIOResult() {}
}
