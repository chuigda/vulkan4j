package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialEntityComponentDataLocationBD} and {@link XrSpatialEntityComponentDataLocationBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialEntityComponentDataLocationBD
    extends IPointer
    permits XrSpatialEntityComponentDataLocationBD, XrSpatialEntityComponentDataLocationBD.Ptr
{}
