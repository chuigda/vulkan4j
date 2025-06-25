package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialAnchorsCreateStorageInfoML} and {@link XrSpatialAnchorsCreateStorageInfoML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialAnchorsCreateStorageInfoML
    extends IPointer
    permits XrSpatialAnchorsCreateStorageInfoML, XrSpatialAnchorsCreateStorageInfoML.Ptr
{}
