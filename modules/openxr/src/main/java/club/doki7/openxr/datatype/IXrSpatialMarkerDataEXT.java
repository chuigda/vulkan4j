package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialMarkerDataEXT} and {@link XrSpatialMarkerDataEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialMarkerDataEXT
    extends IPointer
    permits XrSpatialMarkerDataEXT, XrSpatialMarkerDataEXT.Ptr
{}
