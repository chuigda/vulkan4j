package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GPUBufferLocation} and {@link SDL_GPUBufferLocation.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GPUBufferLocation
    extends IPointer
    permits SDL_GPUBufferLocation, SDL_GPUBufferLocation.Ptr
{}
