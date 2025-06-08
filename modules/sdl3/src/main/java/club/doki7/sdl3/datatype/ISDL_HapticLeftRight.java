package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_HapticLeftRight} and {@link SDL_HapticLeftRight.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_HapticLeftRight
    extends IPointer
    permits SDL_HapticLeftRight, SDL_HapticLeftRight.Ptr
{}
