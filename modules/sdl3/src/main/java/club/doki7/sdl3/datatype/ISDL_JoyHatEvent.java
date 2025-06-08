package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_JoyHatEvent} and {@link SDL_JoyHatEvent.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_JoyHatEvent
    extends IPointer
    permits SDL_JoyHatEvent, SDL_JoyHatEvent.Ptr
{}
