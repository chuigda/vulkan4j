package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Specifies how a transfer buffer is intended to be used by the client.
///
/// Note that mapping and copying FROM an upload transfer buffer or TO a
/// download transfer buffer is undefined behavior.
///
/// Since: This enum is available since SDL 3.2.0.
///
/// See also:
/// - `SDL_CreateGPUTransferBuffer`
///
public final class SDL_GPUTransferBufferUsage {
    public static final int UPLOAD = 0x0;
    public static final int DOWNLOAD = 0x1;

    public static String explain(@EnumType(SDL_GPUTransferBufferUsage.class) int value) {
        return switch (value) {
            case SDL_GPUTransferBufferUsage.DOWNLOAD -> "SDL_GPU_TRANSFERBUFFERUSAGE_DOWNLOAD";
            case SDL_GPUTransferBufferUsage.UPLOAD -> "SDL_GPU_TRANSFERBUFFERUSAGE_UPLOAD";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GPUTransferBufferUsage() {}
}
