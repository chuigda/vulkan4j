package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUShaderModuleDescriptor} and {@link WGPUShaderModuleDescriptor.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUShaderModuleDescriptor
    extends IPointer
    permits WGPUShaderModuleDescriptor, WGPUShaderModuleDescriptor.Ptr
{}
