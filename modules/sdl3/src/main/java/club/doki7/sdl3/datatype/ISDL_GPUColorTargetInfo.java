package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GPUColorTargetInfo} and {@link SDL_GPUColorTargetInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GPUColorTargetInfo
    extends IPointer
    permits SDL_GPUColorTargetInfo, SDL_GPUColorTargetInfo.Ptr
{}
