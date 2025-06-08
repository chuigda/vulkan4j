package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GPUStencilOpState} and {@link SDL_GPUStencilOpState.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GPUStencilOpState
    extends IPointer
    permits SDL_GPUStencilOpState, SDL_GPUStencilOpState.Ptr
{}
