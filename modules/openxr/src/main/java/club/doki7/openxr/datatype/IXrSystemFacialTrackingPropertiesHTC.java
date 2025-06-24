package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSystemFacialTrackingPropertiesHTC} and {@link XrSystemFacialTrackingPropertiesHTC.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSystemFacialTrackingPropertiesHTC
    extends IPointer
    permits XrSystemFacialTrackingPropertiesHTC, XrSystemFacialTrackingPropertiesHTC.Ptr
{}
