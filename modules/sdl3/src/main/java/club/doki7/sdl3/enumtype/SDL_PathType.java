package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Types of filesystem entries.
///
/// Note that there may be other sorts of items on a filesystem: devices,
/// symlinks, named pipes, etc. They are currently reported as
/// SDL_PATHTYPE_OTHER.
///
/// \since This enum is available since SDL 3.2.0.
///
/// \sa SDL_PathInfo
///
public final class SDL_PathType {
    public static final int NONE = 0x0;
    public static final int FILE = 0x1;
    public static final int DIRECTORY = 0x2;
    public static final int OTHER = 0x3;

    public static String explain(@EnumType(SDL_PathType.class) int value) {
        return switch (value) {
            case SDL_PathType.DIRECTORY -> "SDL_PATHTYPE_DIRECTORY";
            case SDL_PathType.FILE -> "SDL_PATHTYPE_FILE";
            case SDL_PathType.NONE -> "SDL_PATHTYPE_NONE";
            case SDL_PathType.OTHER -> "SDL_PATHTYPE_OTHER";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_PathType() {}
}
