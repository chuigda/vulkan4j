package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_AsyncIOOutcome} and {@link SDL_AsyncIOOutcome.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_AsyncIOOutcome
    extends IPointer
    permits SDL_AsyncIOOutcome, SDL_AsyncIOOutcome.Ptr
{}
