package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GPUVertexBufferDescription} and {@link SDL_GPUVertexBufferDescription.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GPUVertexBufferDescription
    extends IPointer
    permits SDL_GPUVertexBufferDescription, SDL_GPUVertexBufferDescription.Ptr
{}
