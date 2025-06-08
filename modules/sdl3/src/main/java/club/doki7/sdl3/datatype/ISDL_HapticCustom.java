package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_HapticCustom} and {@link SDL_HapticCustom.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_HapticCustom
    extends IPointer
    permits SDL_HapticCustom, SDL_HapticCustom.Ptr
{}
