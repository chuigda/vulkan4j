package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GamepadBinding_Input} and {@link SDL_GamepadBinding_Input.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GamepadBinding_Input
    extends IPointer
    permits SDL_GamepadBinding_Input, SDL_GamepadBinding_Input.Ptr
{}
