package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_HapticDirection} and {@link SDL_HapticDirection.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_HapticDirection
    extends IPointer
    permits SDL_HapticDirection, SDL_HapticDirection.Ptr
{}
