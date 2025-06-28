package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUColorTargetState} and {@link WGPUColorTargetState.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUColorTargetState
    extends IPointer
    permits WGPUColorTargetState, WGPUColorTargetState.Ptr
{}
