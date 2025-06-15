package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link RenderPassColorAttachment} and {@link RenderPassColorAttachment.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IRenderPassColorAttachment
    extends IPointer
    permits RenderPassColorAttachment, RenderPassColorAttachment.Ptr
{}
