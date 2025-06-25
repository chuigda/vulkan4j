package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialAnchorCreateInfoMSFT} and {@link XrSpatialAnchorCreateInfoMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialAnchorCreateInfoMSFT
    extends IPointer
    permits XrSpatialAnchorCreateInfoMSFT, XrSpatialAnchorCreateInfoMSFT.Ptr
{}
