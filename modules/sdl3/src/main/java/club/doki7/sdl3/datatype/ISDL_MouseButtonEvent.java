package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_MouseButtonEvent} and {@link SDL_MouseButtonEvent.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_MouseButtonEvent
    extends IPointer
    permits SDL_MouseButtonEvent, SDL_MouseButtonEvent.Ptr
{}
