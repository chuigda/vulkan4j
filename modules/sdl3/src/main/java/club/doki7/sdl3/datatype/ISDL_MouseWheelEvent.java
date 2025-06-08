package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_MouseWheelEvent} and {@link SDL_MouseWheelEvent.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_MouseWheelEvent
    extends IPointer
    permits SDL_MouseWheelEvent, SDL_MouseWheelEvent.Ptr
{}
