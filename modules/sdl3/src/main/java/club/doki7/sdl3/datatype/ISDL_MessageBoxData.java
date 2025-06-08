package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_MessageBoxData} and {@link SDL_MessageBoxData.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_MessageBoxData
    extends IPointer
    permits SDL_MessageBoxData, SDL_MessageBoxData.Ptr
{}
