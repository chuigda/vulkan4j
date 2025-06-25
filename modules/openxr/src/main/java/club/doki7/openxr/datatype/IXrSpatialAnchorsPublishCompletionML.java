package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialAnchorsPublishCompletionML} and {@link XrSpatialAnchorsPublishCompletionML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialAnchorsPublishCompletionML
    extends IPointer
    permits XrSpatialAnchorsPublishCompletionML, XrSpatialAnchorsPublishCompletionML.Ptr
{}
