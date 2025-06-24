package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialAnchorsDeleteInfoML} and {@link XrSpatialAnchorsDeleteInfoML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialAnchorsDeleteInfoML
    extends IPointer
    permits XrSpatialAnchorsDeleteInfoML, XrSpatialAnchorsDeleteInfoML.Ptr
{}
