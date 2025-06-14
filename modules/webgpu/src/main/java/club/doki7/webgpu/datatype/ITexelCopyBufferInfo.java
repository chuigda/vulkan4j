package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link TexelCopyBufferInfo} and {@link TexelCopyBufferInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ITexelCopyBufferInfo
    extends IPointer
    permits TexelCopyBufferInfo, TexelCopyBufferInfo.Ptr
{}
