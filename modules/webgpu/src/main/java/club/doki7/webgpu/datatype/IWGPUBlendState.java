package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUBlendState} and {@link WGPUBlendState.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUBlendState
    extends IPointer
    permits WGPUBlendState, WGPUBlendState.Ptr
{}
