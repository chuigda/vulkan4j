package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GPUBufferCreateInfo} and {@link SDL_GPUBufferCreateInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GPUBufferCreateInfo
    extends IPointer
    permits SDL_GPUBufferCreateInfo, SDL_GPUBufferCreateInfo.Ptr
{}
