package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GPUColorTargetDescription} and {@link SDL_GPUColorTargetDescription.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GPUColorTargetDescription
    extends IPointer
    permits SDL_GPUColorTargetDescription, SDL_GPUColorTargetDescription.Ptr
{}
