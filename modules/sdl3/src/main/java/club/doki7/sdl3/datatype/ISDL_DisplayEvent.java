package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_DisplayEvent} and {@link SDL_DisplayEvent.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_DisplayEvent
    extends IPointer
    permits SDL_DisplayEvent, SDL_DisplayEvent.Ptr
{}
