package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSystemSpatialAnchorPropertiesBD} and {@link XrSystemSpatialAnchorPropertiesBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSystemSpatialAnchorPropertiesBD
    extends IPointer
    permits XrSystemSpatialAnchorPropertiesBD, XrSystemSpatialAnchorPropertiesBD.Ptr
{}
