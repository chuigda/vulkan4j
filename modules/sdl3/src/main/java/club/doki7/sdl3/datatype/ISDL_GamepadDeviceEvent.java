package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GamepadDeviceEvent} and {@link SDL_GamepadDeviceEvent.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GamepadDeviceEvent
    extends IPointer
    permits SDL_GamepadDeviceEvent, SDL_GamepadDeviceEvent.Ptr
{}
