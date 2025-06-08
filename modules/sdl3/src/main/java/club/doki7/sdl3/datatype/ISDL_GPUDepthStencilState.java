package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GPUDepthStencilState} and {@link SDL_GPUDepthStencilState.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GPUDepthStencilState
    extends IPointer
    permits SDL_GPUDepthStencilState, SDL_GPUDepthStencilState.Ptr
{}
