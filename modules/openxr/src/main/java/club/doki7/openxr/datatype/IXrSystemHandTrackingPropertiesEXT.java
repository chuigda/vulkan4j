package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSystemHandTrackingPropertiesEXT} and {@link XrSystemHandTrackingPropertiesEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSystemHandTrackingPropertiesEXT
    extends IPointer
    permits XrSystemHandTrackingPropertiesEXT, XrSystemHandTrackingPropertiesEXT.Ptr
{}
