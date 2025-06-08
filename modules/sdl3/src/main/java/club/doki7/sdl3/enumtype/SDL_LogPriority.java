package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// The predefined log priorities
///
/// \since This enum is available since SDL 3.2.0.
///
public final class SDL_LogPriority {
    public static final int SDL_LOG_PRIORITY_INVALID = 0x0;
    public static final int SDL_LOG_PRIORITY_TRACE = 0x1;
    public static final int SDL_LOG_PRIORITY_VERBOSE = 0x2;
    public static final int SDL_LOG_PRIORITY_DEBUG = 0x3;
    public static final int SDL_LOG_PRIORITY_INFO = 0x4;
    public static final int SDL_LOG_PRIORITY_WARN = 0x5;
    public static final int SDL_LOG_PRIORITY_ERROR = 0x6;
    public static final int SDL_LOG_PRIORITY_CRITICAL = 0x7;
    public static final int SDL_LOG_PRIORITY_COUNT = 0x8;

    public static String explain(@EnumType(SDL_LogPriority.class) int value) {
        return switch (value) {
            case SDL_LogPriority.SDL_LOG_PRIORITY_COUNT -> "SDL_LOG_PRIORITY_COUNT";
            case SDL_LogPriority.SDL_LOG_PRIORITY_CRITICAL -> "SDL_LOG_PRIORITY_CRITICAL";
            case SDL_LogPriority.SDL_LOG_PRIORITY_DEBUG -> "SDL_LOG_PRIORITY_DEBUG";
            case SDL_LogPriority.SDL_LOG_PRIORITY_ERROR -> "SDL_LOG_PRIORITY_ERROR";
            case SDL_LogPriority.SDL_LOG_PRIORITY_INFO -> "SDL_LOG_PRIORITY_INFO";
            case SDL_LogPriority.SDL_LOG_PRIORITY_INVALID -> "SDL_LOG_PRIORITY_INVALID";
            case SDL_LogPriority.SDL_LOG_PRIORITY_TRACE -> "SDL_LOG_PRIORITY_TRACE";
            case SDL_LogPriority.SDL_LOG_PRIORITY_VERBOSE -> "SDL_LOG_PRIORITY_VERBOSE";
            case SDL_LogPriority.SDL_LOG_PRIORITY_WARN -> "SDL_LOG_PRIORITY_WARN";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_LogPriority() {}
}
