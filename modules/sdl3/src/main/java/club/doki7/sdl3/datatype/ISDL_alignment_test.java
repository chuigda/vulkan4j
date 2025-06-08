package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_alignment_test} and {@link SDL_alignment_test.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_alignment_test
    extends IPointer
    permits SDL_alignment_test, SDL_alignment_test.Ptr
{}
