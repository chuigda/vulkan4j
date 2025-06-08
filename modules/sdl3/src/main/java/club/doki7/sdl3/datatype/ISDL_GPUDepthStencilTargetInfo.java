package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GPUDepthStencilTargetInfo} and {@link SDL_GPUDepthStencilTargetInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GPUDepthStencilTargetInfo
    extends IPointer
    permits SDL_GPUDepthStencilTargetInfo, SDL_GPUDepthStencilTargetInfo.Ptr
{}
