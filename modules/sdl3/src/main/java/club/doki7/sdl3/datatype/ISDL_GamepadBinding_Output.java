package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GamepadBinding_Output} and {@link SDL_GamepadBinding_Output.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GamepadBinding_Output
    extends IPointer
    permits SDL_GamepadBinding_Output, SDL_GamepadBinding_Output.Ptr
{}
