package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialEntityStateBD} and {@link XrSpatialEntityStateBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialEntityStateBD
    extends IPointer
    permits XrSpatialEntityStateBD, XrSpatialEntityStateBD.Ptr
{}
