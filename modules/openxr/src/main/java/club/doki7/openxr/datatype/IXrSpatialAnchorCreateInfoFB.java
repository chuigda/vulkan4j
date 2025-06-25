package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialAnchorCreateInfoFB} and {@link XrSpatialAnchorCreateInfoFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialAnchorCreateInfoFB
    extends IPointer
    permits XrSpatialAnchorCreateInfoFB, XrSpatialAnchorCreateInfoFB.Ptr
{}
