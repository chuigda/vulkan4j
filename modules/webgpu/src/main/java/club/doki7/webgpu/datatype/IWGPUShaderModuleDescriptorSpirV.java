package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUShaderModuleDescriptorSpirV} and {@link WGPUShaderModuleDescriptorSpirV.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUShaderModuleDescriptorSpirV
    extends IPointer
    permits WGPUShaderModuleDescriptorSpirV, WGPUShaderModuleDescriptorSpirV.Ptr
{}
