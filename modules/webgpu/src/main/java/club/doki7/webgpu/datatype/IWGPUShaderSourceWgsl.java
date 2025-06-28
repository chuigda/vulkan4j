package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUShaderSourceWgsl} and {@link WGPUShaderSourceWgsl.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUShaderSourceWgsl
    extends IPointer
    permits WGPUShaderSourceWgsl, WGPUShaderSourceWgsl.Ptr
{}
