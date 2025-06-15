package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SurfaceSourceWaylandSurface} and {@link SurfaceSourceWaylandSurface.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISurfaceSourceWaylandSurface
    extends IPointer
    permits SurfaceSourceWaylandSurface, SurfaceSourceWaylandSurface.Ptr
{}
