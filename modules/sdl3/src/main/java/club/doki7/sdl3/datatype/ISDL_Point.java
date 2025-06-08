package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_Point} and {@link SDL_Point.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_Point
    extends IPointer
    permits SDL_Point, SDL_Point.Ptr
{}
