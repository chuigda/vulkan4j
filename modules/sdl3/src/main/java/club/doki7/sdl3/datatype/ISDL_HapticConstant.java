package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_HapticConstant} and {@link SDL_HapticConstant.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_HapticConstant
    extends IPointer
    permits SDL_HapticConstant, SDL_HapticConstant.Ptr
{}
