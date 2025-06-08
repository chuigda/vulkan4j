package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_Rect} and {@link SDL_Rect.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_Rect
    extends IPointer
    permits SDL_Rect, SDL_Rect.Ptr
{}
