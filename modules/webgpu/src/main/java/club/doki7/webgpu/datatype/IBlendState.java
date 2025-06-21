package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link BlendState} and {@link BlendState.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IBlendState
    extends IPointer
    permits BlendState, BlendState.Ptr
{}
