package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPURenderPassDepthStencilAttachment} and {@link WGPURenderPassDepthStencilAttachment.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPURenderPassDepthStencilAttachment
    extends IPointer
    permits WGPURenderPassDepthStencilAttachment, WGPURenderPassDepthStencilAttachment.Ptr
{}
