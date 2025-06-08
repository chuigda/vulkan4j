package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GPUShaderCreateInfo} and {@link SDL_GPUShaderCreateInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GPUShaderCreateInfo
    extends IPointer
    permits SDL_GPUShaderCreateInfo, SDL_GPUShaderCreateInfo.Ptr
{}
