package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_AtomicInt} and {@link SDL_AtomicInt.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_AtomicInt
    extends IPointer
    permits SDL_AtomicInt, SDL_AtomicInt.Ptr
{}
