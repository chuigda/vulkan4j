package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialEntityComponentGetInfoBD} and {@link XrSpatialEntityComponentGetInfoBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialEntityComponentGetInfoBD
    extends IPointer
    permits XrSpatialEntityComponentGetInfoBD, XrSpatialEntityComponentGetInfoBD.Ptr
{}
