package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialPolygon2DDataEXT} and {@link XrSpatialPolygon2DDataEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialPolygon2DDataEXT
    extends IPointer
    permits XrSpatialPolygon2DDataEXT, XrSpatialPolygon2DDataEXT.Ptr
{}
