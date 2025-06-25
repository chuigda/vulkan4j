package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialEntityComponentDataPolygonBD} and {@link XrSpatialEntityComponentDataPolygonBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialEntityComponentDataPolygonBD
    extends IPointer
    permits XrSpatialEntityComponentDataPolygonBD, XrSpatialEntityComponentDataPolygonBD.Ptr
{}
