package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrPlaneDetectorGetInfoEXT} and {@link XrPlaneDetectorGetInfoEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrPlaneDetectorGetInfoEXT
    extends IPointer
    permits XrPlaneDetectorGetInfoEXT, XrPlaneDetectorGetInfoEXT.Ptr
{}
