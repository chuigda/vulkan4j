package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialAnchorsPublishCompletionDetailsML} and {@link XrSpatialAnchorsPublishCompletionDetailsML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialAnchorsPublishCompletionDetailsML
    extends IPointer
    permits XrSpatialAnchorsPublishCompletionDetailsML, XrSpatialAnchorsPublishCompletionDetailsML.Ptr
{}
