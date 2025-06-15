package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link DepthStencilState} and {@link DepthStencilState.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IDepthStencilState
    extends IPointer
    permits DepthStencilState, DepthStencilState.Ptr
{}
