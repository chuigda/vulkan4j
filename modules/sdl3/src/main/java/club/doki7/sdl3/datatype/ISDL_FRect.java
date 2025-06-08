package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_FRect} and {@link SDL_FRect.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_FRect
    extends IPointer
    permits SDL_FRect, SDL_FRect.Ptr
{}
