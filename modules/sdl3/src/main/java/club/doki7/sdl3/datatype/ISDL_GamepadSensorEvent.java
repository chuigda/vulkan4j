package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GamepadSensorEvent} and {@link SDL_GamepadSensorEvent.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GamepadSensorEvent
    extends IPointer
    permits SDL_GamepadSensorEvent, SDL_GamepadSensorEvent.Ptr
{}
