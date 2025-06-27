package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUSurfaceSourceWaylandSurface} and {@link WGPUSurfaceSourceWaylandSurface.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUSurfaceSourceWaylandSurface
    extends IPointer
    permits WGPUSurfaceSourceWaylandSurface, WGPUSurfaceSourceWaylandSurface.Ptr
{}
