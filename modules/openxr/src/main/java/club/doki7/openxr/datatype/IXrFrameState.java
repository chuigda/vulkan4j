package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrFrameState} and {@link XrFrameState.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrFrameState
    extends IPointer
    permits XrFrameState, XrFrameState.Ptr
{}
