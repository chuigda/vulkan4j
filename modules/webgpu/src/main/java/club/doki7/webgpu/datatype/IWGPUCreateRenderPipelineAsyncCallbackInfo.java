package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUCreateRenderPipelineAsyncCallbackInfo} and {@link WGPUCreateRenderPipelineAsyncCallbackInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUCreateRenderPipelineAsyncCallbackInfo
    extends IPointer
    permits WGPUCreateRenderPipelineAsyncCallbackInfo, WGPUCreateRenderPipelineAsyncCallbackInfo.Ptr
{}
