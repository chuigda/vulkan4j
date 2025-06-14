package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link ShaderSourceSpirv} and {@link ShaderSourceSpirv.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IShaderSourceSpirv
    extends IPointer
    permits ShaderSourceSpirv, ShaderSourceSpirv.Ptr
{}
