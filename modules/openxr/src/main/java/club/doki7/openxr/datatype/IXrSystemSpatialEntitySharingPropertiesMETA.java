package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSystemSpatialEntitySharingPropertiesMETA} and {@link XrSystemSpatialEntitySharingPropertiesMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSystemSpatialEntitySharingPropertiesMETA
    extends IPointer
    permits XrSystemSpatialEntitySharingPropertiesMETA, XrSystemSpatialEntitySharingPropertiesMETA.Ptr
{}
