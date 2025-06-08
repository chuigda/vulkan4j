package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_MouseMotionEvent} and {@link SDL_MouseMotionEvent.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_MouseMotionEvent
    extends IPointer
    permits SDL_MouseMotionEvent, SDL_MouseMotionEvent.Ptr
{}
