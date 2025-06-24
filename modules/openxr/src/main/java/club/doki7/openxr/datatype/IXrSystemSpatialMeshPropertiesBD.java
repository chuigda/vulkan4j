package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSystemSpatialMeshPropertiesBD} and {@link XrSystemSpatialMeshPropertiesBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSystemSpatialMeshPropertiesBD
    extends IPointer
    permits XrSystemSpatialMeshPropertiesBD, XrSystemSpatialMeshPropertiesBD.Ptr
{}
