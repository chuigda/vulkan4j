package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_TouchFingerEvent} and {@link SDL_TouchFingerEvent.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_TouchFingerEvent
    extends IPointer
    permits SDL_TouchFingerEvent, SDL_TouchFingerEvent.Ptr
{}
