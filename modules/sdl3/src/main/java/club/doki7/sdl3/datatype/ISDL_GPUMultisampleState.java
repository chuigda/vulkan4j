package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GPUMultisampleState} and {@link SDL_GPUMultisampleState.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GPUMultisampleState
    extends IPointer
    permits SDL_GPUMultisampleState, SDL_GPUMultisampleState.Ptr
{}
