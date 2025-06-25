package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialEntityAnchorCreateInfoBD} and {@link XrSpatialEntityAnchorCreateInfoBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialEntityAnchorCreateInfoBD
    extends IPointer
    permits XrSpatialEntityAnchorCreateInfoBD, XrSpatialEntityAnchorCreateInfoBD.Ptr
{}
