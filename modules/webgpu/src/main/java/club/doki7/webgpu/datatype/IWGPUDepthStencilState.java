package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUDepthStencilState} and {@link WGPUDepthStencilState.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUDepthStencilState
    extends IPointer
    permits WGPUDepthStencilState, WGPUDepthStencilState.Ptr
{}
