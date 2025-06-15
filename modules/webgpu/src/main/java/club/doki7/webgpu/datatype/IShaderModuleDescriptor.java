package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link ShaderModuleDescriptor} and {@link ShaderModuleDescriptor.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IShaderModuleDescriptor
    extends IPointer
    permits ShaderModuleDescriptor, ShaderModuleDescriptor.Ptr
{}
