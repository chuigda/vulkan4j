package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSystemMarkerTrackingPropertiesVARJO} and {@link XrSystemMarkerTrackingPropertiesVARJO.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSystemMarkerTrackingPropertiesVARJO
    extends IPointer
    permits XrSystemMarkerTrackingPropertiesVARJO, XrSystemMarkerTrackingPropertiesVARJO.Ptr
{}
