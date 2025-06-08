package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GPUTextureTransferInfo} and {@link SDL_GPUTextureTransferInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GPUTextureTransferInfo
    extends IPointer
    permits SDL_GPUTextureTransferInfo, SDL_GPUTextureTransferInfo.Ptr
{}
