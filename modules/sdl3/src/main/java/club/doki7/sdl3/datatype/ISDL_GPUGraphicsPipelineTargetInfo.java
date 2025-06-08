package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GPUGraphicsPipelineTargetInfo} and {@link SDL_GPUGraphicsPipelineTargetInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GPUGraphicsPipelineTargetInfo
    extends IPointer
    permits SDL_GPUGraphicsPipelineTargetInfo, SDL_GPUGraphicsPipelineTargetInfo.Ptr
{}
