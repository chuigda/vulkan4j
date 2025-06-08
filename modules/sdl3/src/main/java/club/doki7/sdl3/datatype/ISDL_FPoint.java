package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_FPoint} and {@link SDL_FPoint.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_FPoint
    extends IPointer
    permits SDL_FPoint, SDL_FPoint.Ptr
{}
