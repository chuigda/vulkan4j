package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUShaderSourceSpirv} and {@link WGPUShaderSourceSpirv.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUShaderSourceSpirv
    extends IPointer
    permits WGPUShaderSourceSpirv, WGPUShaderSourceSpirv.Ptr
{}
