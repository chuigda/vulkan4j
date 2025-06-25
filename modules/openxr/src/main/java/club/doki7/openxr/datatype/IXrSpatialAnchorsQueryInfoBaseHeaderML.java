package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialAnchorsQueryInfoBaseHeaderML} and {@link XrSpatialAnchorsQueryInfoBaseHeaderML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialAnchorsQueryInfoBaseHeaderML
    extends IPointer
    permits XrSpatialAnchorsQueryInfoBaseHeaderML, XrSpatialAnchorsQueryInfoBaseHeaderML.Ptr
{}
