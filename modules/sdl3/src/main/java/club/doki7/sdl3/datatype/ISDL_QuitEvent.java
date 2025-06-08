package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_QuitEvent} and {@link SDL_QuitEvent.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_QuitEvent
    extends IPointer
    permits SDL_QuitEvent, SDL_QuitEvent.Ptr
{}
