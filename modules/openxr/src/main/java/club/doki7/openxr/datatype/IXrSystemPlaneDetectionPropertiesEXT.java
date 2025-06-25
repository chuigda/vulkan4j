package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSystemPlaneDetectionPropertiesEXT} and {@link XrSystemPlaneDetectionPropertiesEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSystemPlaneDetectionPropertiesEXT
    extends IPointer
    permits XrSystemPlaneDetectionPropertiesEXT, XrSystemPlaneDetectionPropertiesEXT.Ptr
{}
