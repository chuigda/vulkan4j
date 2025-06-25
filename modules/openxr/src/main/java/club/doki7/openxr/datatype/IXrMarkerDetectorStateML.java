package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrMarkerDetectorStateML} and {@link XrMarkerDetectorStateML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrMarkerDetectorStateML
    extends IPointer
    permits XrMarkerDetectorStateML, XrMarkerDetectorStateML.Ptr
{}
