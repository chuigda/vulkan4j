package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUSurfaceConfigurationExtras} and {@link WGPUSurfaceConfigurationExtras.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUSurfaceConfigurationExtras
    extends IPointer
    permits WGPUSurfaceConfigurationExtras, WGPUSurfaceConfigurationExtras.Ptr
{}
