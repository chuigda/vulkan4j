package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialGraphNodeSpaceCreateInfoMSFT} and {@link XrSpatialGraphNodeSpaceCreateInfoMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialGraphNodeSpaceCreateInfoMSFT
    extends IPointer
    permits XrSpatialGraphNodeSpaceCreateInfoMSFT, XrSpatialGraphNodeSpaceCreateInfoMSFT.Ptr
{}
