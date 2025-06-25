package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrEventDataMarkerTrackingUpdateVARJO} and {@link XrEventDataMarkerTrackingUpdateVARJO.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrEventDataMarkerTrackingUpdateVARJO
    extends IPointer
    permits XrEventDataMarkerTrackingUpdateVARJO, XrEventDataMarkerTrackingUpdateVARJO.Ptr
{}
