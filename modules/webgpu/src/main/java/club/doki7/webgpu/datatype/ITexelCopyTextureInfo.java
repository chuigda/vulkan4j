package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link TexelCopyTextureInfo} and {@link TexelCopyTextureInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ITexelCopyTextureInfo
    extends IPointer
    permits TexelCopyTextureInfo, TexelCopyTextureInfo.Ptr
{}
