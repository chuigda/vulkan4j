package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUBufferDescriptor} and {@link WGPUBufferDescriptor.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUBufferDescriptor
    extends IPointer
    permits WGPUBufferDescriptor, WGPUBufferDescriptor.Ptr
{}
