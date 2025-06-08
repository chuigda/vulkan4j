package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_IOStreamInterface} and {@link SDL_IOStreamInterface.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_IOStreamInterface
    extends IPointer
    permits SDL_IOStreamInterface, SDL_IOStreamInterface.Ptr
{}
