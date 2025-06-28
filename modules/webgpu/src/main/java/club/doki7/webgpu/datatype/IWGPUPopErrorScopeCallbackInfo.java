package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUPopErrorScopeCallbackInfo} and {@link WGPUPopErrorScopeCallbackInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUPopErrorScopeCallbackInfo
    extends IPointer
    permits WGPUPopErrorScopeCallbackInfo, WGPUPopErrorScopeCallbackInfo.Ptr
{}
