package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_JoyDeviceEvent} and {@link SDL_JoyDeviceEvent.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_JoyDeviceEvent
    extends IPointer
    permits SDL_JoyDeviceEvent, SDL_JoyDeviceEvent.Ptr
{}
