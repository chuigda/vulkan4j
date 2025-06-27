package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUSurfaceTexture} and {@link WGPUSurfaceTexture.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUSurfaceTexture
    extends IPointer
    permits WGPUSurfaceTexture, WGPUSurfaceTexture.Ptr
{}
