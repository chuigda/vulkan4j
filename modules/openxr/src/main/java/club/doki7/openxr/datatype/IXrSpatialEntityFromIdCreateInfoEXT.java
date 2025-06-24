package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialEntityFromIdCreateInfoEXT} and {@link XrSpatialEntityFromIdCreateInfoEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialEntityFromIdCreateInfoEXT
    extends IPointer
    permits XrSpatialEntityFromIdCreateInfoEXT, XrSpatialEntityFromIdCreateInfoEXT.Ptr
{}
