package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrInteractionProfileState} and {@link XrInteractionProfileState.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrInteractionProfileState
    extends IPointer
    permits XrInteractionProfileState, XrInteractionProfileState.Ptr
{}
