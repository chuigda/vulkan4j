package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialEntityComponentDataBaseHeaderBD} and {@link XrSpatialEntityComponentDataBaseHeaderBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialEntityComponentDataBaseHeaderBD
    extends IPointer
    permits XrSpatialEntityComponentDataBaseHeaderBD, XrSpatialEntityComponentDataBaseHeaderBD.Ptr
{}
