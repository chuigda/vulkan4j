package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_Finger} and {@link SDL_Finger.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_Finger
    extends IPointer
    permits SDL_Finger, SDL_Finger.Ptr
{}
