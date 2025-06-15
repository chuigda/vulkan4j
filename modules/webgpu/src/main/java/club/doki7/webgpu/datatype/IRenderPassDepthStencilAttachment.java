package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link RenderPassDepthStencilAttachment} and {@link RenderPassDepthStencilAttachment.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IRenderPassDepthStencilAttachment
    extends IPointer
    permits RenderPassDepthStencilAttachment, RenderPassDepthStencilAttachment.Ptr
{}
