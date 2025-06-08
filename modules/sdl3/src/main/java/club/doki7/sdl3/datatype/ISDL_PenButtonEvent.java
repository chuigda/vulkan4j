package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_PenButtonEvent} and {@link SDL_PenButtonEvent.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_PenButtonEvent
    extends IPointer
    permits SDL_PenButtonEvent, SDL_PenButtonEvent.Ptr
{}
