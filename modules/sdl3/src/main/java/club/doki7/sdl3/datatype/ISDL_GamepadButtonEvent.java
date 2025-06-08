package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GamepadButtonEvent} and {@link SDL_GamepadButtonEvent.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GamepadButtonEvent
    extends IPointer
    permits SDL_GamepadButtonEvent, SDL_GamepadButtonEvent.Ptr
{}
