package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// The SDL thread priority.
///
/// SDL will make system changes as necessary in order to apply the thread
/// priority. Code which attempts to control thread state related to priority
/// should be aware that calling SDL_SetCurrentThreadPriority may alter such
/// state. SDL_HINT_THREAD_PRIORITY_POLICY can be used to control aspects of
/// this behavior.
///
/// \since This enum is available since SDL 3.2.0.
///
public final class SDL_ThreadPriority {
    public static final int SDL_THREAD_PRIORITY_LOW = 0x0;
    public static final int SDL_THREAD_PRIORITY_NORMAL = 0x1;
    public static final int SDL_THREAD_PRIORITY_HIGH = 0x2;
    public static final int SDL_THREAD_PRIORITY_TIME_CRITICAL = 0x3;

    public static String explain(@EnumType(SDL_ThreadPriority.class) int value) {
        return switch (value) {
            case SDL_ThreadPriority.SDL_THREAD_PRIORITY_HIGH -> "SDL_THREAD_PRIORITY_HIGH";
            case SDL_ThreadPriority.SDL_THREAD_PRIORITY_LOW -> "SDL_THREAD_PRIORITY_LOW";
            case SDL_ThreadPriority.SDL_THREAD_PRIORITY_NORMAL -> "SDL_THREAD_PRIORITY_NORMAL";
            case SDL_ThreadPriority.SDL_THREAD_PRIORITY_TIME_CRITICAL -> "SDL_THREAD_PRIORITY_TIME_CRITICAL";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_ThreadPriority() {}
}
