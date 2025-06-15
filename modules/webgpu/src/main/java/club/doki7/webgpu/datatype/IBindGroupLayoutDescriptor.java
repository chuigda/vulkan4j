package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link BindGroupLayoutDescriptor} and {@link BindGroupLayoutDescriptor.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IBindGroupLayoutDescriptor
    extends IPointer
    permits BindGroupLayoutDescriptor, BindGroupLayoutDescriptor.Ptr
{}
