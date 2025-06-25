package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSystemSpatialSensingPropertiesBD} and {@link XrSystemSpatialSensingPropertiesBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSystemSpatialSensingPropertiesBD
    extends IPointer
    permits XrSystemSpatialSensingPropertiesBD, XrSystemSpatialSensingPropertiesBD.Ptr
{}
