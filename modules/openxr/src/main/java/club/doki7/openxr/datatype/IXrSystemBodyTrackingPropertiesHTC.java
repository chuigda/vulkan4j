package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSystemBodyTrackingPropertiesHTC} and {@link XrSystemBodyTrackingPropertiesHTC.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSystemBodyTrackingPropertiesHTC
    extends IPointer
    permits XrSystemBodyTrackingPropertiesHTC, XrSystemBodyTrackingPropertiesHTC.Ptr
{}
