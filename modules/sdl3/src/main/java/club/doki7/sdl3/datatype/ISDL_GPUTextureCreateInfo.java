package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GPUTextureCreateInfo} and {@link SDL_GPUTextureCreateInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GPUTextureCreateInfo
    extends IPointer
    permits SDL_GPUTextureCreateInfo, SDL_GPUTextureCreateInfo.Ptr
{}
