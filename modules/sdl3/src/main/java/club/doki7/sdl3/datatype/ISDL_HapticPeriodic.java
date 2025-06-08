package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_HapticPeriodic} and {@link SDL_HapticPeriodic.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_HapticPeriodic
    extends IPointer
    permits SDL_HapticPeriodic, SDL_HapticPeriodic.Ptr
{}
