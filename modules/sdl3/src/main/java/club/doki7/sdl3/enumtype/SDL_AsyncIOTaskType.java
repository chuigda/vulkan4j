package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Types of asynchronous I/O tasks.
///
/// \since This enum is available since SDL 3.2.0.
///
public final class SDL_AsyncIOTaskType {
    public static final int SDL_ASYNCIO_TASK_READ = 0x0;
    public static final int SDL_ASYNCIO_TASK_WRITE = 0x1;
    public static final int SDL_ASYNCIO_TASK_CLOSE = 0x2;

    public static String explain(@EnumType(SDL_AsyncIOTaskType.class) int value) {
        return switch (value) {
            case SDL_AsyncIOTaskType.SDL_ASYNCIO_TASK_CLOSE -> "SDL_ASYNCIO_TASK_CLOSE";
            case SDL_AsyncIOTaskType.SDL_ASYNCIO_TASK_READ -> "SDL_ASYNCIO_TASK_READ";
            case SDL_AsyncIOTaskType.SDL_ASYNCIO_TASK_WRITE -> "SDL_ASYNCIO_TASK_WRITE";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_AsyncIOTaskType() {}
}
