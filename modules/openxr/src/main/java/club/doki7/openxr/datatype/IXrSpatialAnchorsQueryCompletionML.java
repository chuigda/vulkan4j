package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialAnchorsQueryCompletionML} and {@link XrSpatialAnchorsQueryCompletionML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialAnchorsQueryCompletionML
    extends IPointer
    permits XrSpatialAnchorsQueryCompletionML, XrSpatialAnchorsQueryCompletionML.Ptr
{}
