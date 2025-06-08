package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_JoyAxisEvent} and {@link SDL_JoyAxisEvent.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_JoyAxisEvent
    extends IPointer
    permits SDL_JoyAxisEvent, SDL_JoyAxisEvent.Ptr
{}
