package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPURequestDeviceCallbackInfo} and {@link WGPURequestDeviceCallbackInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPURequestDeviceCallbackInfo
    extends IPointer
    permits WGPURequestDeviceCallbackInfo, WGPURequestDeviceCallbackInfo.Ptr
{}
