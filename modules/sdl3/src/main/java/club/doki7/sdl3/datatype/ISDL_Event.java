package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_Event} and {@link SDL_Event.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_Event
    extends IPointer
    permits SDL_Event, SDL_Event.Ptr
{}
