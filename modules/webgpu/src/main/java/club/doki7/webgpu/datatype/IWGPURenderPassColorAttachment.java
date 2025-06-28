package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPURenderPassColorAttachment} and {@link WGPURenderPassColorAttachment.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPURenderPassColorAttachment
    extends IPointer
    permits WGPURenderPassColorAttachment, WGPURenderPassColorAttachment.Ptr
{}
