package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GPUTextureLocation} and {@link SDL_GPUTextureLocation.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GPUTextureLocation
    extends IPointer
    permits SDL_GPUTextureLocation, SDL_GPUTextureLocation.Ptr
{}
