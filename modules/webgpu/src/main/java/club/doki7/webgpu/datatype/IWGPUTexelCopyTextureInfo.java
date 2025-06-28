package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUTexelCopyTextureInfo} and {@link WGPUTexelCopyTextureInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUTexelCopyTextureInfo
    extends IPointer
    permits WGPUTexelCopyTextureInfo, WGPUTexelCopyTextureInfo.Ptr
{}
