package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSystemBodyTrackingPropertiesBD} and {@link XrSystemBodyTrackingPropertiesBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSystemBodyTrackingPropertiesBD
    extends IPointer
    permits XrSystemBodyTrackingPropertiesBD, XrSystemBodyTrackingPropertiesBD.Ptr
{}
