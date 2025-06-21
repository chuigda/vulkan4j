package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link VertexState} and {@link VertexState.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IVertexState
    extends IPointer
    permits VertexState, VertexState.Ptr
{}
