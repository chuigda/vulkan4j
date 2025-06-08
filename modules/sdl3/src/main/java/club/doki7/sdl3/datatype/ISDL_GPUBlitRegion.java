package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GPUBlitRegion} and {@link SDL_GPUBlitRegion.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GPUBlitRegion
    extends IPointer
    permits SDL_GPUBlitRegion, SDL_GPUBlitRegion.Ptr
{}
