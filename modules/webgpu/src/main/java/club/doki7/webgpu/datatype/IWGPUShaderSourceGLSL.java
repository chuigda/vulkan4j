package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUShaderSourceGLSL} and {@link WGPUShaderSourceGLSL.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUShaderSourceGLSL
    extends IPointer
    permits WGPUShaderSourceGLSL, WGPUShaderSourceGLSL.Ptr
{}
