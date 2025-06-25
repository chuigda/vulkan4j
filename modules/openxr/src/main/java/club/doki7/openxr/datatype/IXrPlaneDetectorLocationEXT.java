package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrPlaneDetectorLocationEXT} and {@link XrPlaneDetectorLocationEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrPlaneDetectorLocationEXT
    extends IPointer
    permits XrPlaneDetectorLocationEXT, XrPlaneDetectorLocationEXT.Ptr
{}
