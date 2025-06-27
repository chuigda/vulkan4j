package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUCompilationInfoCallbackInfo} and {@link WGPUCompilationInfoCallbackInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUCompilationInfoCallbackInfo
    extends IPointer
    permits WGPUCompilationInfoCallbackInfo, WGPUCompilationInfoCallbackInfo.Ptr
{}
