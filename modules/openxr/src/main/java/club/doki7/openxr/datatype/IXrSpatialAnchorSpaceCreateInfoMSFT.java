package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialAnchorSpaceCreateInfoMSFT} and {@link XrSpatialAnchorSpaceCreateInfoMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialAnchorSpaceCreateInfoMSFT
    extends IPointer
    permits XrSpatialAnchorSpaceCreateInfoMSFT, XrSpatialAnchorSpaceCreateInfoMSFT.Ptr
{}
