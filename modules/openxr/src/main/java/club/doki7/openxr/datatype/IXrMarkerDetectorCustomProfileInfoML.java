package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrMarkerDetectorCustomProfileInfoML} and {@link XrMarkerDetectorCustomProfileInfoML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrMarkerDetectorCustomProfileInfoML
    extends IPointer
    permits XrMarkerDetectorCustomProfileInfoML, XrMarkerDetectorCustomProfileInfoML.Ptr
{}
