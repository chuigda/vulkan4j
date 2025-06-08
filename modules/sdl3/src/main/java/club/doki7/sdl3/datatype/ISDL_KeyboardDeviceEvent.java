package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_KeyboardDeviceEvent} and {@link SDL_KeyboardDeviceEvent.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_KeyboardDeviceEvent
    extends IPointer
    permits SDL_KeyboardDeviceEvent, SDL_KeyboardDeviceEvent.Ptr
{}
