package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// The predefined log priorities
///
/// Since: This enum is available since SDL 3.2.0.
///
public final class SDL_LogPriority {
    public static final int INVALID = 0x0;
    public static final int TRACE = 0x1;
    public static final int VERBOSE = 0x2;
    public static final int DEBUG = 0x3;
    public static final int INFO = 0x4;
    public static final int WARN = 0x5;
    public static final int ERROR = 0x6;
    public static final int CRITICAL = 0x7;
    public static final int COUNT = 0x8;

    public static String explain(@EnumType(SDL_LogPriority.class) int value) {
        return switch (value) {
            case SDL_LogPriority.COUNT -> "SDL_LOG_PRIORITY_COUNT";
            case SDL_LogPriority.CRITICAL -> "SDL_LOG_PRIORITY_CRITICAL";
            case SDL_LogPriority.DEBUG -> "SDL_LOG_PRIORITY_DEBUG";
            case SDL_LogPriority.ERROR -> "SDL_LOG_PRIORITY_ERROR";
            case SDL_LogPriority.INFO -> "SDL_LOG_PRIORITY_INFO";
            case SDL_LogPriority.INVALID -> "SDL_LOG_PRIORITY_INVALID";
            case SDL_LogPriority.TRACE -> "SDL_LOG_PRIORITY_TRACE";
            case SDL_LogPriority.VERBOSE -> "SDL_LOG_PRIORITY_VERBOSE";
            case SDL_LogPriority.WARN -> "SDL_LOG_PRIORITY_WARN";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_LogPriority() {}
}
