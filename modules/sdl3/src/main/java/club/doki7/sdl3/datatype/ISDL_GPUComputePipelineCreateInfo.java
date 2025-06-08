package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GPUComputePipelineCreateInfo} and {@link SDL_GPUComputePipelineCreateInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GPUComputePipelineCreateInfo
    extends IPointer
    permits SDL_GPUComputePipelineCreateInfo, SDL_GPUComputePipelineCreateInfo.Ptr
{}
