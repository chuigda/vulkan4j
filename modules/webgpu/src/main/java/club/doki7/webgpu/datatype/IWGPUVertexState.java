package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUVertexState} and {@link WGPUVertexState.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUVertexState
    extends IPointer
    permits WGPUVertexState, WGPUVertexState.Ptr
{}
