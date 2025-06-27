package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUMultisampleState} and {@link WGPUMultisampleState.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUMultisampleState
    extends IPointer
    permits WGPUMultisampleState, WGPUMultisampleState.Ptr
{}
