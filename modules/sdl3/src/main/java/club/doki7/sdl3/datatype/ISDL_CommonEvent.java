package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_CommonEvent} and {@link SDL_CommonEvent.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_CommonEvent
    extends IPointer
    permits SDL_CommonEvent, SDL_CommonEvent.Ptr
{}
