package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link InstanceDescriptor} and {@link InstanceDescriptor.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IInstanceDescriptor
    extends IPointer
    permits InstanceDescriptor, InstanceDescriptor.Ptr
{}
