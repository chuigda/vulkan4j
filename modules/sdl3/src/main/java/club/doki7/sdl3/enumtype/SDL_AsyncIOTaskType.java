package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Types of asynchronous I/O tasks.
///
/// \since This enum is available since SDL 3.2.0.
///
public final class SDL_AsyncIOTaskType {
    public static final int READ = 0x0;
    public static final int WRITE = 0x1;
    public static final int CLOSE = 0x2;

    public static String explain(@EnumType(SDL_AsyncIOTaskType.class) int value) {
        return switch (value) {
            case SDL_AsyncIOTaskType.CLOSE -> "SDL_ASYNCIO_TASK_CLOSE";
            case SDL_AsyncIOTaskType.READ -> "SDL_ASYNCIO_TASK_READ";
            case SDL_AsyncIOTaskType.WRITE -> "SDL_ASYNCIO_TASK_WRITE";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_AsyncIOTaskType() {}
}
