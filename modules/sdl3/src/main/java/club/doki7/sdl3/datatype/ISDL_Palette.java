package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_Palette} and {@link SDL_Palette.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_Palette
    extends IPointer
    permits SDL_Palette, SDL_Palette.Ptr
{}
