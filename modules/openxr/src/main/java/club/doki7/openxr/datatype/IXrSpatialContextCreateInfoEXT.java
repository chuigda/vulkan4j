package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialContextCreateInfoEXT} and {@link XrSpatialContextCreateInfoEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialContextCreateInfoEXT
    extends IPointer
    permits XrSpatialContextCreateInfoEXT, XrSpatialContextCreateInfoEXT.Ptr
{}
