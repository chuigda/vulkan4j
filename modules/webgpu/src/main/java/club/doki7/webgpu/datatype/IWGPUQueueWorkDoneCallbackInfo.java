package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUQueueWorkDoneCallbackInfo} and {@link WGPUQueueWorkDoneCallbackInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUQueueWorkDoneCallbackInfo
    extends IPointer
    permits WGPUQueueWorkDoneCallbackInfo, WGPUQueueWorkDoneCallbackInfo.Ptr
{}
