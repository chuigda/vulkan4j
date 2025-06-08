package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GamepadTouchpadEvent} and {@link SDL_GamepadTouchpadEvent.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GamepadTouchpadEvent
    extends IPointer
    permits SDL_GamepadTouchpadEvent, SDL_GamepadTouchpadEvent.Ptr
{}
