package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_HapticEffect} and {@link SDL_HapticEffect.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_HapticEffect
    extends IPointer
    permits SDL_HapticEffect, SDL_HapticEffect.Ptr
{}
