package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialCapabilityConfigurationAnchorEXT} and {@link XrSpatialCapabilityConfigurationAnchorEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialCapabilityConfigurationAnchorEXT
    extends IPointer
    permits XrSpatialCapabilityConfigurationAnchorEXT, XrSpatialCapabilityConfigurationAnchorEXT.Ptr
{}
