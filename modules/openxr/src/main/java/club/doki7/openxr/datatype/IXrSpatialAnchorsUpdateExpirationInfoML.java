package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialAnchorsUpdateExpirationInfoML} and {@link XrSpatialAnchorsUpdateExpirationInfoML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialAnchorsUpdateExpirationInfoML
    extends IPointer
    permits XrSpatialAnchorsUpdateExpirationInfoML, XrSpatialAnchorsUpdateExpirationInfoML.Ptr
{}
