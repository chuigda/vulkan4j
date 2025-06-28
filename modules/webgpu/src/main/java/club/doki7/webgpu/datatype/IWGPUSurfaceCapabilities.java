package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUSurfaceCapabilities} and {@link WGPUSurfaceCapabilities.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUSurfaceCapabilities
    extends IPointer
    permits WGPUSurfaceCapabilities, WGPUSurfaceCapabilities.Ptr
{}
