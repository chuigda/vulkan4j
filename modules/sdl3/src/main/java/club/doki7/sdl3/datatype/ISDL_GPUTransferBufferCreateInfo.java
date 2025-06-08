package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GPUTransferBufferCreateInfo} and {@link SDL_GPUTransferBufferCreateInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GPUTransferBufferCreateInfo
    extends IPointer
    permits SDL_GPUTransferBufferCreateInfo, SDL_GPUTransferBufferCreateInfo.Ptr
{}
