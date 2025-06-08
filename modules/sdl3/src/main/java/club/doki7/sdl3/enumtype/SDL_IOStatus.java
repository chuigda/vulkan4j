package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// SDL_IOStream status, set by a read or write operation.
///
/// \since This enum is available since SDL 3.2.0.
///
public final class SDL_IOStatus {
    public static final int SDL_IO_STATUS_READY = 0x0;
    public static final int SDL_IO_STATUS_ERROR = 0x1;
    public static final int SDL_IO_STATUS_EOF = 0x2;
    public static final int SDL_IO_STATUS_NOT_READY = 0x3;
    public static final int SDL_IO_STATUS_READONLY = 0x4;
    public static final int SDL_IO_STATUS_WRITEONLY = 0x5;

    public static String explain(@EnumType(SDL_IOStatus.class) int value) {
        return switch (value) {
            case SDL_IOStatus.SDL_IO_STATUS_EOF -> "SDL_IO_STATUS_EOF";
            case SDL_IOStatus.SDL_IO_STATUS_ERROR -> "SDL_IO_STATUS_ERROR";
            case SDL_IOStatus.SDL_IO_STATUS_NOT_READY -> "SDL_IO_STATUS_NOT_READY";
            case SDL_IOStatus.SDL_IO_STATUS_READONLY -> "SDL_IO_STATUS_READONLY";
            case SDL_IOStatus.SDL_IO_STATUS_READY -> "SDL_IO_STATUS_READY";
            case SDL_IOStatus.SDL_IO_STATUS_WRITEONLY -> "SDL_IO_STATUS_WRITEONLY";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_IOStatus() {}
}
