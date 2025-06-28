package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPURenderPipelineDescriptor} and {@link WGPURenderPipelineDescriptor.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPURenderPipelineDescriptor
    extends IPointer
    permits WGPURenderPipelineDescriptor, WGPURenderPipelineDescriptor.Ptr
{}
