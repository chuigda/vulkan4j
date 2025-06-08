package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GPUTextureRegion} and {@link SDL_GPUTextureRegion.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GPUTextureRegion
    extends IPointer
    permits SDL_GPUTextureRegion, SDL_GPUTextureRegion.Ptr
{}
