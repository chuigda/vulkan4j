package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GPUBufferBinding} and {@link SDL_GPUBufferBinding.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GPUBufferBinding
    extends IPointer
    permits SDL_GPUBufferBinding, SDL_GPUBufferBinding.Ptr
{}
