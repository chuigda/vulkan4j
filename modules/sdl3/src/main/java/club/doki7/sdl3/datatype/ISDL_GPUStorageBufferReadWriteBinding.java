package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GPUStorageBufferReadWriteBinding} and {@link SDL_GPUStorageBufferReadWriteBinding.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GPUStorageBufferReadWriteBinding
    extends IPointer
    permits SDL_GPUStorageBufferReadWriteBinding, SDL_GPUStorageBufferReadWriteBinding.Ptr
{}
