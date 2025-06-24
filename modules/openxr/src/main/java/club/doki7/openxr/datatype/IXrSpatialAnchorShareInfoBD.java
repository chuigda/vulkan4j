package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialAnchorShareInfoBD} and {@link XrSpatialAnchorShareInfoBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialAnchorShareInfoBD
    extends IPointer
    permits XrSpatialAnchorShareInfoBD, XrSpatialAnchorShareInfoBD.Ptr
{}
