package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrMarkerDetectorAprilTagInfoML} and {@link XrMarkerDetectorAprilTagInfoML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrMarkerDetectorAprilTagInfoML
    extends IPointer
    permits XrMarkerDetectorAprilTagInfoML, XrMarkerDetectorAprilTagInfoML.Ptr
{}
