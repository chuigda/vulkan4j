package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialAnchorCreateInfoBD} and {@link XrSpatialAnchorCreateInfoBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialAnchorCreateInfoBD
    extends IPointer
    permits XrSpatialAnchorCreateInfoBD, XrSpatialAnchorCreateInfoBD.Ptr
{}
