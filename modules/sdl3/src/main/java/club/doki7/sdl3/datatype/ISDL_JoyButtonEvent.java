package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_JoyButtonEvent} and {@link SDL_JoyButtonEvent.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_JoyButtonEvent
    extends IPointer
    permits SDL_JoyButtonEvent, SDL_JoyButtonEvent.Ptr
{}
