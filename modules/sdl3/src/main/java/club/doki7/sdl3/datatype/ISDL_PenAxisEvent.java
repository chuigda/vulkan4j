package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_PenAxisEvent} and {@link SDL_PenAxisEvent.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_PenAxisEvent
    extends IPointer
    permits SDL_PenAxisEvent, SDL_PenAxisEvent.Ptr
{}
