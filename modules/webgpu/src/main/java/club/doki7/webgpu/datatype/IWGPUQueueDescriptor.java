package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUQueueDescriptor} and {@link WGPUQueueDescriptor.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUQueueDescriptor
    extends IPointer
    permits WGPUQueueDescriptor, WGPUQueueDescriptor.Ptr
{}
