package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link ComputePipelineDescriptor} and {@link ComputePipelineDescriptor.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IComputePipelineDescriptor
    extends IPointer
    permits ComputePipelineDescriptor, ComputePipelineDescriptor.Ptr
{}
