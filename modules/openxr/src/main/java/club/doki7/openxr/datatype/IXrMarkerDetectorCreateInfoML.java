package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrMarkerDetectorCreateInfoML} and {@link XrMarkerDetectorCreateInfoML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrMarkerDetectorCreateInfoML
    extends IPointer
    permits XrMarkerDetectorCreateInfoML, XrMarkerDetectorCreateInfoML.Ptr
{}
