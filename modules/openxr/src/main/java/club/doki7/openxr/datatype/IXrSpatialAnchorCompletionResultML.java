package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialAnchorCompletionResultML} and {@link XrSpatialAnchorCompletionResultML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialAnchorCompletionResultML
    extends IPointer
    permits XrSpatialAnchorCompletionResultML, XrSpatialAnchorCompletionResultML.Ptr
{}
