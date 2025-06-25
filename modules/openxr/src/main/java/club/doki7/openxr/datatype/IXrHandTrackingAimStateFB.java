package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrHandTrackingAimStateFB} and {@link XrHandTrackingAimStateFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrHandTrackingAimStateFB
    extends IPointer
    permits XrHandTrackingAimStateFB, XrHandTrackingAimStateFB.Ptr
{}
