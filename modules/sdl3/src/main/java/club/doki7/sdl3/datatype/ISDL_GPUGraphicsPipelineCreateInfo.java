package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GPUGraphicsPipelineCreateInfo} and {@link SDL_GPUGraphicsPipelineCreateInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GPUGraphicsPipelineCreateInfo
    extends IPointer
    permits SDL_GPUGraphicsPipelineCreateInfo, SDL_GPUGraphicsPipelineCreateInfo.Ptr
{}
