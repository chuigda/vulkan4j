package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUSurfaceConfigurationExtras WGPU_STRUCTURE_ATTRIBUTE} and {@link WGPUSurfaceConfigurationExtras WGPU_STRUCTURE_ATTRIBUTE.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUSurfaceConfigurationExtras WGPU_STRUCTURE_ATTRIBUTE
    extends IPointer
    permits WGPUSurfaceConfigurationExtras WGPU_STRUCTURE_ATTRIBUTE, WGPUSurfaceConfigurationExtras WGPU_STRUCTURE_ATTRIBUTE.Ptr
{}
