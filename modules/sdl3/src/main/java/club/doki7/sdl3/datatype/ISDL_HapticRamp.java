package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_HapticRamp} and {@link SDL_HapticRamp.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_HapticRamp
    extends IPointer
    permits SDL_HapticRamp, SDL_HapticRamp.Ptr
{}
