package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUComputePipelineDescriptor} and {@link WGPUComputePipelineDescriptor.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUComputePipelineDescriptor
    extends IPointer
    permits WGPUComputePipelineDescriptor, WGPUComputePipelineDescriptor.Ptr
{}
