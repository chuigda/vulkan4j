package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_DropEvent} and {@link SDL_DropEvent.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_DropEvent
    extends IPointer
    permits SDL_DropEvent, SDL_DropEvent.Ptr
{}
