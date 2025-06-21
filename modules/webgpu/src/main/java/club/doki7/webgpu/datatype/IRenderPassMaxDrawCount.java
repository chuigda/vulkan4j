package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link RenderPassMaxDrawCount} and {@link RenderPassMaxDrawCount.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IRenderPassMaxDrawCount
    extends IPointer
    permits RenderPassMaxDrawCount, RenderPassMaxDrawCount.Ptr
{}
