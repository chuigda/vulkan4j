package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialBounded2DDataEXT} and {@link XrSpatialBounded2DDataEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialBounded2DDataEXT
    extends IPointer
    permits XrSpatialBounded2DDataEXT, XrSpatialBounded2DDataEXT.Ptr
{}
