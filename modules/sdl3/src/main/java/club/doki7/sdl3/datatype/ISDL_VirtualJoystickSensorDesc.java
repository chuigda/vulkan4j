package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_VirtualJoystickSensorDesc} and {@link SDL_VirtualJoystickSensorDesc.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_VirtualJoystickSensorDesc
    extends IPointer
    permits SDL_VirtualJoystickSensorDesc, SDL_VirtualJoystickSensorDesc.Ptr
{}
