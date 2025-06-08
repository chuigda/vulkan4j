package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_PenProximityEvent} and {@link SDL_PenProximityEvent.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_PenProximityEvent
    extends IPointer
    permits SDL_PenProximityEvent, SDL_PenProximityEvent.Ptr
{}
