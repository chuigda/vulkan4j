package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_PenMotionEvent} and {@link SDL_PenMotionEvent.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_PenMotionEvent
    extends IPointer
    permits SDL_PenMotionEvent, SDL_PenMotionEvent.Ptr
{}
