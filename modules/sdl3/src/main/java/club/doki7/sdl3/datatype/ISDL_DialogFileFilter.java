package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_DialogFileFilter} and {@link SDL_DialogFileFilter.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_DialogFileFilter
    extends IPointer
    permits SDL_DialogFileFilter, SDL_DialogFileFilter.Ptr
{}
