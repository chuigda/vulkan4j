package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSystemSpatialPlanePropertiesBD} and {@link XrSystemSpatialPlanePropertiesBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSystemSpatialPlanePropertiesBD
    extends IPointer
    permits XrSystemSpatialPlanePropertiesBD, XrSystemSpatialPlanePropertiesBD.Ptr
{}
