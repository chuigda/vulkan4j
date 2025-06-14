package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link RenderPassDescriptor} and {@link RenderPassDescriptor.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IRenderPassDescriptor
    extends IPointer
    permits RenderPassDescriptor, RenderPassDescriptor.Ptr
{}
