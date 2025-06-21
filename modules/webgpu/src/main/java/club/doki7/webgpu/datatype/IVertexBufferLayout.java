package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link VertexBufferLayout} and {@link VertexBufferLayout.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IVertexBufferLayout
    extends IPointer
    permits VertexBufferLayout, VertexBufferLayout.Ptr
{}
