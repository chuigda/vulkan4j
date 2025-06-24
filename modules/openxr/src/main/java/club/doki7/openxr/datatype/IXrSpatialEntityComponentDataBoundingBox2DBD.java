package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialEntityComponentDataBoundingBox2DBD} and {@link XrSpatialEntityComponentDataBoundingBox2DBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialEntityComponentDataBoundingBox2DBD
    extends IPointer
    permits XrSpatialEntityComponentDataBoundingBox2DBD, XrSpatialEntityComponentDataBoundingBox2DBD.Ptr
{}
