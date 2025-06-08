package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_MouseDeviceEvent} and {@link SDL_MouseDeviceEvent.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_MouseDeviceEvent
    extends IPointer
    permits SDL_MouseDeviceEvent, SDL_MouseDeviceEvent.Ptr
{}
