package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GPUTransferBufferLocation} and {@link SDL_GPUTransferBufferLocation.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GPUTransferBufferLocation
    extends IPointer
    permits SDL_GPUTransferBufferLocation, SDL_GPUTransferBufferLocation.Ptr
{}
