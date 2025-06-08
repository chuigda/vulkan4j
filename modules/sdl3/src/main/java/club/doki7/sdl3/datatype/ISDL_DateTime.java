package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_DateTime} and {@link SDL_DateTime.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_DateTime
    extends IPointer
    permits SDL_DateTime, SDL_DateTime.Ptr
{}
