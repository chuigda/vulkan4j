package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_MessageBoxButtonData} and {@link SDL_MessageBoxButtonData.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_MessageBoxButtonData
    extends IPointer
    permits SDL_MessageBoxButtonData, SDL_MessageBoxButtonData.Ptr
{}
