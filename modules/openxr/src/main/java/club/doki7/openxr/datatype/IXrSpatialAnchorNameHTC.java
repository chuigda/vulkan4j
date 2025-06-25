package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialAnchorNameHTC} and {@link XrSpatialAnchorNameHTC.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialAnchorNameHTC
    extends IPointer
    permits XrSpatialAnchorNameHTC, XrSpatialAnchorNameHTC.Ptr
{}
