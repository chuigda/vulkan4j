package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link StencilFaceState} and {@link StencilFaceState.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IStencilFaceState
    extends IPointer
    permits StencilFaceState, StencilFaceState.Ptr
{}
