package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_InitState} and {@link SDL_InitState.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_InitState
    extends IPointer
    permits SDL_InitState, SDL_InitState.Ptr
{}
