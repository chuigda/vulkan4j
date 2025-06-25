package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialAnchorCreateCompletionBD} and {@link XrSpatialAnchorCreateCompletionBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialAnchorCreateCompletionBD
    extends IPointer
    permits XrSpatialAnchorCreateCompletionBD, XrSpatialAnchorCreateCompletionBD.Ptr
{}
