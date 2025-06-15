package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link BufferBindingLayout} and {@link BufferBindingLayout.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IBufferBindingLayout
    extends IPointer
    permits BufferBindingLayout, BufferBindingLayout.Ptr
{}
