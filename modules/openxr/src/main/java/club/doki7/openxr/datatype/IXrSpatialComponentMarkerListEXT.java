package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialComponentMarkerListEXT} and {@link XrSpatialComponentMarkerListEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialComponentMarkerListEXT
    extends IPointer
    permits XrSpatialComponentMarkerListEXT, XrSpatialComponentMarkerListEXT.Ptr
{}
