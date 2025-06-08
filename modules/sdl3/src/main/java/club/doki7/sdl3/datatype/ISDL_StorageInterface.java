package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_StorageInterface} and {@link SDL_StorageInterface.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_StorageInterface
    extends IPointer
    permits SDL_StorageInterface, SDL_StorageInterface.Ptr
{}
