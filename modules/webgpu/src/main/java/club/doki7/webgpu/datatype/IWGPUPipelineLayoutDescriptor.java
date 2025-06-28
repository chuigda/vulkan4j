package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUPipelineLayoutDescriptor} and {@link WGPUPipelineLayoutDescriptor.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUPipelineLayoutDescriptor
    extends IPointer
    permits WGPUPipelineLayoutDescriptor, WGPUPipelineLayoutDescriptor.Ptr
{}
