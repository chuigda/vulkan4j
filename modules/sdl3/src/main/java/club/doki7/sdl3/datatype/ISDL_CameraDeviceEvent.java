package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_CameraDeviceEvent} and {@link SDL_CameraDeviceEvent.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_CameraDeviceEvent
    extends IPointer
    permits SDL_CameraDeviceEvent, SDL_CameraDeviceEvent.Ptr
{}
