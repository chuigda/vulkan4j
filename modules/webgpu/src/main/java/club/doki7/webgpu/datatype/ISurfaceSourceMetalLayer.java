package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SurfaceSourceMetalLayer} and {@link SurfaceSourceMetalLayer.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISurfaceSourceMetalLayer
    extends IPointer
    permits SurfaceSourceMetalLayer, SurfaceSourceMetalLayer.Ptr
{}
