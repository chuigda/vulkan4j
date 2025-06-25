package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialAnchorCreateInfoHTC} and {@link XrSpatialAnchorCreateInfoHTC.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialAnchorCreateInfoHTC
    extends IPointer
    permits XrSpatialAnchorCreateInfoHTC, XrSpatialAnchorCreateInfoHTC.Ptr
{}
