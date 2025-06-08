package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GamepadBinding_Output_Axis} and {@link SDL_GamepadBinding_Output_Axis.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GamepadBinding_Output_Axis
    extends IPointer
    permits SDL_GamepadBinding_Output_Axis, SDL_GamepadBinding_Output_Axis.Ptr
{}
