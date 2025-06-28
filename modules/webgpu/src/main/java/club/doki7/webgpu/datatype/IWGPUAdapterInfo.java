package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUAdapterInfo} and {@link WGPUAdapterInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUAdapterInfo
    extends IPointer
    permits WGPUAdapterInfo, WGPUAdapterInfo.Ptr
{}
