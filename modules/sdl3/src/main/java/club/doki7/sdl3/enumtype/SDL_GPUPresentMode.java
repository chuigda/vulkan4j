package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Specifies the timing that will be used to present swapchain textures to the
/// OS.
///
/// VSYNC mode will always be supported. IMMEDIATE and MAILBOX modes may not be
/// supported on certain systems.
///
/// It is recommended to query SDL_WindowSupportsGPUPresentMode after claiming
/// the window if you wish to change the present mode to IMMEDIATE or MAILBOX.
///
/// - VSYNC: Waits for vblank before presenting. No tearing is possible. If
///   there is a pending image to present, the new image is enqueued for
///   presentation. Disallows tearing at the cost of visual latency.
/// - IMMEDIATE: Immediately presents. Lowest latency option, but tearing may
///   occur.
/// - MAILBOX: Waits for vblank before presenting. No tearing is possible. If
///   there is a pending image to present, the pending image is replaced by the
///   new image. Similar to VSYNC, but with reduced visual latency.
///
/// \since This enum is available since SDL 3.2.0.
///
/// \sa SDL_SetGPUSwapchainParameters
/// \sa SDL_WindowSupportsGPUPresentMode
/// \sa SDL_WaitAndAcquireGPUSwapchainTexture
///
public final class SDL_GPUPresentMode {
    public static final int SDL_GPU_PRESENTMODE_VSYNC = 0x0;
    public static final int SDL_GPU_PRESENTMODE_IMMEDIATE = 0x1;
    public static final int SDL_GPU_PRESENTMODE_MAILBOX = 0x2;

    public static String explain(@EnumType(SDL_GPUPresentMode.class) int value) {
        return switch (value) {
            case SDL_GPUPresentMode.SDL_GPU_PRESENTMODE_IMMEDIATE -> "SDL_GPU_PRESENTMODE_IMMEDIATE";
            case SDL_GPUPresentMode.SDL_GPU_PRESENTMODE_MAILBOX -> "SDL_GPU_PRESENTMODE_MAILBOX";
            case SDL_GPUPresentMode.SDL_GPU_PRESENTMODE_VSYNC -> "SDL_GPU_PRESENTMODE_VSYNC";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GPUPresentMode() {}
}
