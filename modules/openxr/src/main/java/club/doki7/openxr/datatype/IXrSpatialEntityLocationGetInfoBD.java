package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialEntityLocationGetInfoBD} and {@link XrSpatialEntityLocationGetInfoBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialEntityLocationGetInfoBD
    extends IPointer
    permits XrSpatialEntityLocationGetInfoBD, XrSpatialEntityLocationGetInfoBD.Ptr
{}
