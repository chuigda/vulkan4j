package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_HapticCondition} and {@link SDL_HapticCondition.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_HapticCondition
    extends IPointer
    permits SDL_HapticCondition, SDL_HapticCondition.Ptr
{}
