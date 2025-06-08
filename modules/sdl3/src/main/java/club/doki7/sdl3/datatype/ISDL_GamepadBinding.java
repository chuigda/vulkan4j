package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GamepadBinding} and {@link SDL_GamepadBinding.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GamepadBinding
    extends IPointer
    permits SDL_GamepadBinding, SDL_GamepadBinding.Ptr
{}
