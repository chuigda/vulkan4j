package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialAnchorsCreateInfoBaseHeaderML} and {@link XrSpatialAnchorsCreateInfoBaseHeaderML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialAnchorsCreateInfoBaseHeaderML
    extends IPointer
    permits XrSpatialAnchorsCreateInfoBaseHeaderML, XrSpatialAnchorsCreateInfoBaseHeaderML.Ptr
{}
