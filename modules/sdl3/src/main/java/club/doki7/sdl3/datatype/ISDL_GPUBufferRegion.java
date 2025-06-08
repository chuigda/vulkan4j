package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GPUBufferRegion} and {@link SDL_GPUBufferRegion.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GPUBufferRegion
    extends IPointer
    permits SDL_GPUBufferRegion, SDL_GPUBufferRegion.Ptr
{}
