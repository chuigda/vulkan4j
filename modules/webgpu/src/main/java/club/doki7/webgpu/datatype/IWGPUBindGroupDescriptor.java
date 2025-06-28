package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUBindGroupDescriptor} and {@link WGPUBindGroupDescriptor.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUBindGroupDescriptor
    extends IPointer
    permits WGPUBindGroupDescriptor, WGPUBindGroupDescriptor.Ptr
{}
