package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_VirtualJoystickDesc} and {@link SDL_VirtualJoystickDesc.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_VirtualJoystickDesc
    extends IPointer
    permits SDL_VirtualJoystickDesc, SDL_VirtualJoystickDesc.Ptr
{}
