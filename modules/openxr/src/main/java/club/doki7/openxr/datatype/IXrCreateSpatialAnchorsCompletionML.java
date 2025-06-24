package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrCreateSpatialAnchorsCompletionML} and {@link XrCreateSpatialAnchorsCompletionML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrCreateSpatialAnchorsCompletionML
    extends IPointer
    permits XrCreateSpatialAnchorsCompletionML, XrCreateSpatialAnchorsCompletionML.Ptr
{}
