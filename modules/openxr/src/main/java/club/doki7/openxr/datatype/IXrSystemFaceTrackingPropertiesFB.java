package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSystemFaceTrackingPropertiesFB} and {@link XrSystemFaceTrackingPropertiesFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSystemFaceTrackingPropertiesFB
    extends IPointer
    permits XrSystemFaceTrackingPropertiesFB, XrSystemFaceTrackingPropertiesFB.Ptr
{}
