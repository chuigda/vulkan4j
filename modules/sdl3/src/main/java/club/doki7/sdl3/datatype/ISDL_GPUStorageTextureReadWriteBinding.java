package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GPUStorageTextureReadWriteBinding} and {@link SDL_GPUStorageTextureReadWriteBinding.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GPUStorageTextureReadWriteBinding
    extends IPointer
    permits SDL_GPUStorageTextureReadWriteBinding, SDL_GPUStorageTextureReadWriteBinding.Ptr
{}
