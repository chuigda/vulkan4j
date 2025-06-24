package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialAnchorsCreateInfoFromUuidsML} and {@link XrSpatialAnchorsCreateInfoFromUuidsML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialAnchorsCreateInfoFromUuidsML
    extends IPointer
    permits XrSpatialAnchorsCreateInfoFromUuidsML, XrSpatialAnchorsCreateInfoFromUuidsML.Ptr
{}
