package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUSurfaceSourceMetalLayer} and {@link WGPUSurfaceSourceMetalLayer.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUSurfaceSourceMetalLayer
    extends IPointer
    permits WGPUSurfaceSourceMetalLayer, WGPUSurfaceSourceMetalLayer.Ptr
{}
