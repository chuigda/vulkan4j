package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialFilterTrackingStateEXT} and {@link XrSpatialFilterTrackingStateEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialFilterTrackingStateEXT
    extends IPointer
    permits XrSpatialFilterTrackingStateEXT, XrSpatialFilterTrackingStateEXT.Ptr
{}
