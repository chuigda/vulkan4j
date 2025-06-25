package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialComponentPolygon2DListEXT} and {@link XrSpatialComponentPolygon2DListEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialComponentPolygon2DListEXT
    extends IPointer
    permits XrSpatialComponentPolygon2DListEXT, XrSpatialComponentPolygon2DListEXT.Ptr
{}
