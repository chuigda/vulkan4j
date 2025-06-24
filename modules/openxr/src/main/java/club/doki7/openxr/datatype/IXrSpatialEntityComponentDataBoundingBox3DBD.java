package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialEntityComponentDataBoundingBox3DBD} and {@link XrSpatialEntityComponentDataBoundingBox3DBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialEntityComponentDataBoundingBox3DBD
    extends IPointer
    permits XrSpatialEntityComponentDataBoundingBox3DBD, XrSpatialEntityComponentDataBoundingBox3DBD.Ptr
{}
