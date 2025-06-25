package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSystemSpatialEntityPropertiesFB} and {@link XrSystemSpatialEntityPropertiesFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSystemSpatialEntityPropertiesFB
    extends IPointer
    permits XrSystemSpatialEntityPropertiesFB, XrSystemSpatialEntityPropertiesFB.Ptr
{}
