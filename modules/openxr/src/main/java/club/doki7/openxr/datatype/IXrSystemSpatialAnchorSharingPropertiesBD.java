package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSystemSpatialAnchorSharingPropertiesBD} and {@link XrSystemSpatialAnchorSharingPropertiesBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSystemSpatialAnchorSharingPropertiesBD
    extends IPointer
    permits XrSystemSpatialAnchorSharingPropertiesBD, XrSystemSpatialAnchorSharingPropertiesBD.Ptr
{}
