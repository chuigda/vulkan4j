package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUShaderDefine} and {@link WGPUShaderDefine.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUShaderDefine
    extends IPointer
    permits WGPUShaderDefine, WGPUShaderDefine.Ptr
{}
