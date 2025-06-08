package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_UserEvent} and {@link SDL_UserEvent.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_UserEvent
    extends IPointer
    permits SDL_UserEvent, SDL_UserEvent.Ptr
{}
