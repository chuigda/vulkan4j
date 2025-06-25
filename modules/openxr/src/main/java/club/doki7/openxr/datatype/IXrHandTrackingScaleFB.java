package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrHandTrackingScaleFB} and {@link XrHandTrackingScaleFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrHandTrackingScaleFB
    extends IPointer
    permits XrHandTrackingScaleFB, XrHandTrackingScaleFB.Ptr
{}
