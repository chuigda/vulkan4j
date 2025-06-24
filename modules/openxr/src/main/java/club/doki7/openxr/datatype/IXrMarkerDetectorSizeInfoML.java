package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrMarkerDetectorSizeInfoML} and {@link XrMarkerDetectorSizeInfoML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrMarkerDetectorSizeInfoML
    extends IPointer
    permits XrMarkerDetectorSizeInfoML, XrMarkerDetectorSizeInfoML.Ptr
{}
