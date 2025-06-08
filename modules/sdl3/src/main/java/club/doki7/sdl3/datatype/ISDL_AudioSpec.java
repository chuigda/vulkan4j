package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_AudioSpec} and {@link SDL_AudioSpec.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_AudioSpec
    extends IPointer
    permits SDL_AudioSpec, SDL_AudioSpec.Ptr
{}
