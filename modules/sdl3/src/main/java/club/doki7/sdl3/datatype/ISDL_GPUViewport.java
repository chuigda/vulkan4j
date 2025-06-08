package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GPUViewport} and {@link SDL_GPUViewport.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GPUViewport
    extends IPointer
    permits SDL_GPUViewport, SDL_GPUViewport.Ptr
{}
