package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GUID} and {@link SDL_GUID.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GUID
    extends IPointer
    permits SDL_GUID, SDL_GUID.Ptr
{}
