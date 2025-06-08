package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// The SDL thread state.
///
/// The current state of a thread can be checked by calling SDL_GetThreadState.
///
/// Since: This enum is available since SDL 3.2.0.
///
/// See also:
/// - `SDL_GetThreadState`
///
public final class SDL_ThreadState {
    public static final int UNKNOWN = 0x0;
    public static final int ALIVE = 0x1;
    public static final int DETACHED = 0x2;
    public static final int COMPLETE = 0x3;

    public static String explain(@EnumType(SDL_ThreadState.class) int value) {
        return switch (value) {
            case SDL_ThreadState.ALIVE -> "SDL_THREAD_ALIVE";
            case SDL_ThreadState.COMPLETE -> "SDL_THREAD_COMPLETE";
            case SDL_ThreadState.DETACHED -> "SDL_THREAD_DETACHED";
            case SDL_ThreadState.UNKNOWN -> "SDL_THREAD_UNKNOWN";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_ThreadState() {}
}
