package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialAnchorsDeleteCompletionML} and {@link XrSpatialAnchorsDeleteCompletionML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialAnchorsDeleteCompletionML
    extends IPointer
    permits XrSpatialAnchorsDeleteCompletionML, XrSpatialAnchorsDeleteCompletionML.Ptr
{}
