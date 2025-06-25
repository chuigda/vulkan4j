package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSystemBodyTrackingPropertiesFB} and {@link XrSystemBodyTrackingPropertiesFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSystemBodyTrackingPropertiesFB
    extends IPointer
    permits XrSystemBodyTrackingPropertiesFB, XrSystemBodyTrackingPropertiesFB.Ptr
{}
