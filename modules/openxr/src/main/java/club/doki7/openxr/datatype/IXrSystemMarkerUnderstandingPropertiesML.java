package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSystemMarkerUnderstandingPropertiesML} and {@link XrSystemMarkerUnderstandingPropertiesML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSystemMarkerUnderstandingPropertiesML
    extends IPointer
    permits XrSystemMarkerUnderstandingPropertiesML, XrSystemMarkerUnderstandingPropertiesML.Ptr
{}
