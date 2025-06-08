package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GPUColorTargetBlendState} and {@link SDL_GPUColorTargetBlendState.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GPUColorTargetBlendState
    extends IPointer
    permits SDL_GPUColorTargetBlendState, SDL_GPUColorTargetBlendState.Ptr
{}
