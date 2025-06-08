package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Specifies how the contents of a texture attached to a render pass are
/// treated at the end of the render pass.
///
/// \since This enum is available since SDL 3.2.0.
///
/// \sa SDL_BeginGPURenderPass
///
public final class SDL_GPUStoreOp {
    public static final int STORE = 0x0;
    public static final int DONT_CARE = 0x1;
    public static final int RESOLVE = 0x2;
    public static final int RESOLVE_AND_STORE = 0x3;

    public static String explain(@EnumType(SDL_GPUStoreOp.class) int value) {
        return switch (value) {
            case SDL_GPUStoreOp.DONT_CARE -> "SDL_GPU_STOREOP_DONT_CARE";
            case SDL_GPUStoreOp.RESOLVE -> "SDL_GPU_STOREOP_RESOLVE";
            case SDL_GPUStoreOp.RESOLVE_AND_STORE -> "SDL_GPU_STOREOP_RESOLVE_AND_STORE";
            case SDL_GPUStoreOp.STORE -> "SDL_GPU_STOREOP_STORE";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GPUStoreOp() {}
}
