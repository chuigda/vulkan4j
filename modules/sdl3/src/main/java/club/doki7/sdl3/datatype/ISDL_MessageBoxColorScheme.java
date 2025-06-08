package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_MessageBoxColorScheme} and {@link SDL_MessageBoxColorScheme.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_MessageBoxColorScheme
    extends IPointer
    permits SDL_MessageBoxColorScheme, SDL_MessageBoxColorScheme.Ptr
{}
