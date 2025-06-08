package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_AudioDeviceEvent} and {@link SDL_AudioDeviceEvent.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_AudioDeviceEvent
    extends IPointer
    permits SDL_AudioDeviceEvent, SDL_AudioDeviceEvent.Ptr
{}
