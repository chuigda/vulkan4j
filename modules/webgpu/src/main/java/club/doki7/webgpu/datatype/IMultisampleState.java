package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link MultisampleState} and {@link MultisampleState.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IMultisampleState
    extends IPointer
    permits MultisampleState, MultisampleState.Ptr
{}
