package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link BindGroupDescriptor} and {@link BindGroupDescriptor.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IBindGroupDescriptor
    extends IPointer
    permits BindGroupDescriptor, BindGroupDescriptor.Ptr
{}
