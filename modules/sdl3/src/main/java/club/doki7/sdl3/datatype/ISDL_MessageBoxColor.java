package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_MessageBoxColor} and {@link SDL_MessageBoxColor.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_MessageBoxColor
    extends IPointer
    permits SDL_MessageBoxColor, SDL_MessageBoxColor.Ptr
{}
