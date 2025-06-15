package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link ColorTargetState} and {@link ColorTargetState.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IColorTargetState
    extends IPointer
    permits ColorTargetState, ColorTargetState.Ptr
{}
