package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_SensorEvent} and {@link SDL_SensorEvent.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_SensorEvent
    extends IPointer
    permits SDL_SensorEvent, SDL_SensorEvent.Ptr
{}
