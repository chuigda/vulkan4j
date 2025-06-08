package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_Color} and {@link SDL_Color.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_Color
    extends IPointer
    permits SDL_Color, SDL_Color.Ptr
{}
