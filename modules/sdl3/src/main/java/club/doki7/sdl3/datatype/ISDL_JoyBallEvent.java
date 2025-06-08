package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_JoyBallEvent} and {@link SDL_JoyBallEvent.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_JoyBallEvent
    extends IPointer
    permits SDL_JoyBallEvent, SDL_JoyBallEvent.Ptr
{}
