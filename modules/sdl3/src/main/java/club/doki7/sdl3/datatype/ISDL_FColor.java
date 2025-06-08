package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_FColor} and {@link SDL_FColor.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_FColor
    extends IPointer
    permits SDL_FColor, SDL_FColor.Ptr
{}
