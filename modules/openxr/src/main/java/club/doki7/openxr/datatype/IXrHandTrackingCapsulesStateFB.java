package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrHandTrackingCapsulesStateFB} and {@link XrHandTrackingCapsulesStateFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrHandTrackingCapsulesStateFB
    extends IPointer
    permits XrHandTrackingCapsulesStateFB, XrHandTrackingCapsulesStateFB.Ptr
{}
