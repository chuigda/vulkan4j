package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_KeyboardEvent} and {@link SDL_KeyboardEvent.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_KeyboardEvent
    extends IPointer
    permits SDL_KeyboardEvent, SDL_KeyboardEvent.Ptr
{}
