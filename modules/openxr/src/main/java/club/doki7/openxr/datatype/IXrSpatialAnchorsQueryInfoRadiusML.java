package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialAnchorsQueryInfoRadiusML} and {@link XrSpatialAnchorsQueryInfoRadiusML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialAnchorsQueryInfoRadiusML
    extends IPointer
    permits XrSpatialAnchorsQueryInfoRadiusML, XrSpatialAnchorsQueryInfoRadiusML.Ptr
{}
