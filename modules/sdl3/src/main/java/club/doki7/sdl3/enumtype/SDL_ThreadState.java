package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// The SDL thread state.
///
/// The current state of a thread can be checked by calling SDL_GetThreadState.
///
/// \since This enum is available since SDL 3.2.0.
///
/// \sa SDL_GetThreadState
///
public final class SDL_ThreadState {
    public static final int SDL_THREAD_UNKNOWN = 0x0;
    public static final int SDL_THREAD_ALIVE = 0x1;
    public static final int SDL_THREAD_DETACHED = 0x2;
    public static final int SDL_THREAD_COMPLETE = 0x3;

    public static String explain(@EnumType(SDL_ThreadState.class) int value) {
        return switch (value) {
            case SDL_ThreadState.SDL_THREAD_ALIVE -> "SDL_THREAD_ALIVE";
            case SDL_ThreadState.SDL_THREAD_COMPLETE -> "SDL_THREAD_COMPLETE";
            case SDL_ThreadState.SDL_THREAD_DETACHED -> "SDL_THREAD_DETACHED";
            case SDL_ThreadState.SDL_THREAD_UNKNOWN -> "SDL_THREAD_UNKNOWN";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_ThreadState() {}
}
