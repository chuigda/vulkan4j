package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link QueueDescriptor} and {@link QueueDescriptor.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IQueueDescriptor
    extends IPointer
    permits QueueDescriptor, QueueDescriptor.Ptr
{}
