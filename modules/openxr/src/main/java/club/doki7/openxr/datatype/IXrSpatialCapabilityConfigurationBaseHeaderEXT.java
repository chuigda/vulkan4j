package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialCapabilityConfigurationBaseHeaderEXT} and {@link XrSpatialCapabilityConfigurationBaseHeaderEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialCapabilityConfigurationBaseHeaderEXT
    extends IPointer
    permits XrSpatialCapabilityConfigurationBaseHeaderEXT, XrSpatialCapabilityConfigurationBaseHeaderEXT.Ptr
{}
