package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUUncapturedErrorCallbackInfo} and {@link WGPUUncapturedErrorCallbackInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUUncapturedErrorCallbackInfo
    extends IPointer
    permits WGPUUncapturedErrorCallbackInfo, WGPUUncapturedErrorCallbackInfo.Ptr
{}
