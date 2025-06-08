package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_PenTouchEvent} and {@link SDL_PenTouchEvent.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_PenTouchEvent
    extends IPointer
    permits SDL_PenTouchEvent, SDL_PenTouchEvent.Ptr
{}
