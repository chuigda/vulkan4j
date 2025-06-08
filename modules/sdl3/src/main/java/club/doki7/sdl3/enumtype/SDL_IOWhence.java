package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Possible `whence` values for SDL_IOStream seeking.
///
/// These map to the same "whence" concept that `fseek` or `lseek` use in the
/// standard C runtime.
///
/// \since This enum is available since SDL 3.2.0.
///
public final class SDL_IOWhence {
    public static final int SET = 0x0;
    public static final int CUR = 0x1;
    public static final int END = 0x2;

    public static String explain(@EnumType(SDL_IOWhence.class) int value) {
        return switch (value) {
            case SDL_IOWhence.CUR -> "SDL_IO_SEEK_CUR";
            case SDL_IOWhence.END -> "SDL_IO_SEEK_END";
            case SDL_IOWhence.SET -> "SDL_IO_SEEK_SET";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_IOWhence() {}
}
