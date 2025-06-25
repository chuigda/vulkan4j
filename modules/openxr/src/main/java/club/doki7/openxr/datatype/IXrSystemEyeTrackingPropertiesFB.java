package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSystemEyeTrackingPropertiesFB} and {@link XrSystemEyeTrackingPropertiesFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSystemEyeTrackingPropertiesFB
    extends IPointer
    permits XrSystemEyeTrackingPropertiesFB, XrSystemEyeTrackingPropertiesFB.Ptr
{}
