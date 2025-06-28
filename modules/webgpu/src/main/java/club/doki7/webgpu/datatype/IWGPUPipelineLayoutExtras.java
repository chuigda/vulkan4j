package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUPipelineLayoutExtras} and {@link WGPUPipelineLayoutExtras.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUPipelineLayoutExtras
    extends IPointer
    permits WGPUPipelineLayoutExtras, WGPUPipelineLayoutExtras.Ptr
{}
