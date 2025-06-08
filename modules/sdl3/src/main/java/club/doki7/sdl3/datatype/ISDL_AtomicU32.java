package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_AtomicU32} and {@link SDL_AtomicU32.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_AtomicU32
    extends IPointer
    permits SDL_AtomicU32, SDL_AtomicU32.Ptr
{}
