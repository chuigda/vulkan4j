package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_PathInfo} and {@link SDL_PathInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_PathInfo
    extends IPointer
    permits SDL_PathInfo, SDL_PathInfo.Ptr
{}
