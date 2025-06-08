package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_DisplayMode} and {@link SDL_DisplayMode.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_DisplayMode
    extends IPointer
    permits SDL_DisplayMode, SDL_DisplayMode.Ptr
{}
