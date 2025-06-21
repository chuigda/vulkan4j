package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link ComputePassDescriptor} and {@link ComputePassDescriptor.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IComputePassDescriptor
    extends IPointer
    permits ComputePassDescriptor, ComputePassDescriptor.Ptr
{}
