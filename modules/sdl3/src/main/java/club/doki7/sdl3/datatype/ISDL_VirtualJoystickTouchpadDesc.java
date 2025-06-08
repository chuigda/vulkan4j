package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_VirtualJoystickTouchpadDesc} and {@link SDL_VirtualJoystickTouchpadDesc.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_VirtualJoystickTouchpadDesc
    extends IPointer
    permits SDL_VirtualJoystickTouchpadDesc, SDL_VirtualJoystickTouchpadDesc.Ptr
{}
