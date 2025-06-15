package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SurfaceDescriptor} and {@link SurfaceDescriptor.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISurfaceDescriptor
    extends IPointer
    permits SurfaceDescriptor, SurfaceDescriptor.Ptr
{}
