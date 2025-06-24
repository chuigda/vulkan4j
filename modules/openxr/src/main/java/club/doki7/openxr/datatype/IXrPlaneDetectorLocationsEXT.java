package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrPlaneDetectorLocationsEXT} and {@link XrPlaneDetectorLocationsEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrPlaneDetectorLocationsEXT
    extends IPointer
    permits XrPlaneDetectorLocationsEXT, XrPlaneDetectorLocationsEXT.Ptr
{}
