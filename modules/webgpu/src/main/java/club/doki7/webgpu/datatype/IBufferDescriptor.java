package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link BufferDescriptor} and {@link BufferDescriptor.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IBufferDescriptor
    extends IPointer
    permits BufferDescriptor, BufferDescriptor.Ptr
{}
