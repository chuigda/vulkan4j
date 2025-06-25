package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialAnchorsPublishInfoML} and {@link XrSpatialAnchorsPublishInfoML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialAnchorsPublishInfoML
    extends IPointer
    permits XrSpatialAnchorsPublishInfoML, XrSpatialAnchorsPublishInfoML.Ptr
{}
