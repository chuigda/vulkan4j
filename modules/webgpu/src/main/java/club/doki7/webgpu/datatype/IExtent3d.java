package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link Extent3d} and {@link Extent3d.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IExtent3d
    extends IPointer
    permits Extent3d, Extent3d.Ptr
{}
