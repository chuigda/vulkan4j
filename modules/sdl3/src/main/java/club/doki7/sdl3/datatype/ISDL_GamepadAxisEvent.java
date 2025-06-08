package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GamepadAxisEvent} and {@link SDL_GamepadAxisEvent.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GamepadAxisEvent
    extends IPointer
    permits SDL_GamepadAxisEvent, SDL_GamepadAxisEvent.Ptr
{}
