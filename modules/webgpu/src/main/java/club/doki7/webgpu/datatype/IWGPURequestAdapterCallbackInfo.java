package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPURequestAdapterCallbackInfo} and {@link WGPURequestAdapterCallbackInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPURequestAdapterCallbackInfo
    extends IPointer
    permits WGPURequestAdapterCallbackInfo, WGPURequestAdapterCallbackInfo.Ptr
{}
