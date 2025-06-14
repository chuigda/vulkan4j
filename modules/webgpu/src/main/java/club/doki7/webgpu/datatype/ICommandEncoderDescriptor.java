package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link CommandEncoderDescriptor} and {@link CommandEncoderDescriptor.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ICommandEncoderDescriptor
    extends IPointer
    permits CommandEncoderDescriptor, CommandEncoderDescriptor.Ptr
{}
