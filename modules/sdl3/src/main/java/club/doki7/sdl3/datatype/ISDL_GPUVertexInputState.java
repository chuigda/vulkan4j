package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GPUVertexInputState} and {@link SDL_GPUVertexInputState.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GPUVertexInputState
    extends IPointer
    permits SDL_GPUVertexInputState, SDL_GPUVertexInputState.Ptr
{}
