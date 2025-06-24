package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialCapabilityComponentTypesEXT} and {@link XrSpatialCapabilityComponentTypesEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialCapabilityComponentTypesEXT
    extends IPointer
    permits XrSpatialCapabilityComponentTypesEXT, XrSpatialCapabilityComponentTypesEXT.Ptr
{}
