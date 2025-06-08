package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Specifies the texture format and colorspace of the swapchain textures.
///
/// SDR will always be supported. Other compositions may not be supported on
/// certain systems.
///
/// It is recommended to query SDL_WindowSupportsGPUSwapchainComposition after
/// claiming the window if you wish to change the swapchain composition from
/// SDR.
///
/// - SDR: B8G8R8A8 or R8G8B8A8 swapchain. Pixel values are in sRGB encoding.
/// - SDR_LINEAR: B8G8R8A8_SRGB or R8G8B8A8_SRGB swapchain. Pixel values are
/// stored in memory in sRGB encoding but accessed in shaders in "linear
/// sRGB" encoding which is sRGB but with a linear transfer function.
/// - HDR_EXTENDED_LINEAR: R16G16B16A16_FLOAT swapchain. Pixel values are in
/// extended linear sRGB encoding and permits values outside of the [0, 1]
/// range.
/// - HDR10_ST2084: A2R10G10B10 or A2B10G10R10 swapchain. Pixel values are in
/// BT.2020 ST2084 (PQ) encoding.
///
/// Since: This enum is available since SDL 3.2.0.
///
/// See also:
/// - `SDL_SetGPUSwapchainParameters`
/// - `SDL_WindowSupportsGPUSwapchainComposition`
/// - `SDL_WaitAndAcquireGPUSwapchainTexture`
///
public final class SDL_GPUSwapchainComposition {
    public static final int SDR = 0x0;
    public static final int SDR_LINEAR = 0x1;
    public static final int HDR_EXTENDED_LINEAR = 0x2;
    public static final int HDR10_ST2084 = 0x3;

    public static String explain(@EnumType(SDL_GPUSwapchainComposition.class) int value) {
        return switch (value) {
            case SDL_GPUSwapchainComposition.HDR10_ST2084 -> "SDL_GPU_SWAPCHAINCOMPOSITION_HDR10_ST2084";
            case SDL_GPUSwapchainComposition.HDR_EXTENDED_LINEAR -> "SDL_GPU_SWAPCHAINCOMPOSITION_HDR_EXTENDED_LINEAR";
            case SDL_GPUSwapchainComposition.SDR -> "SDL_GPU_SWAPCHAINCOMPOSITION_SDR";
            case SDL_GPUSwapchainComposition.SDR_LINEAR -> "SDL_GPU_SWAPCHAINCOMPOSITION_SDR_LINEAR";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GPUSwapchainComposition() {}
}
