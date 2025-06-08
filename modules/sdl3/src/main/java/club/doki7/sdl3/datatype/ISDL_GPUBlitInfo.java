package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GPUBlitInfo} and {@link SDL_GPUBlitInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GPUBlitInfo
    extends IPointer
    permits SDL_GPUBlitInfo, SDL_GPUBlitInfo.Ptr
{}
