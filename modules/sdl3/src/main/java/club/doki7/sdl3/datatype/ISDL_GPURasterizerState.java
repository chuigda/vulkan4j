package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GPURasterizerState} and {@link SDL_GPURasterizerState.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GPURasterizerState
    extends IPointer
    permits SDL_GPURasterizerState, SDL_GPURasterizerState.Ptr
{}
