package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUFragmentState} and {@link WGPUFragmentState.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUFragmentState
    extends IPointer
    permits WGPUFragmentState, WGPUFragmentState.Ptr
{}
