package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialAnchorCreateInfoEXT} and {@link XrSpatialAnchorCreateInfoEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialAnchorCreateInfoEXT
    extends IPointer
    permits XrSpatialAnchorCreateInfoEXT, XrSpatialAnchorCreateInfoEXT.Ptr
{}
