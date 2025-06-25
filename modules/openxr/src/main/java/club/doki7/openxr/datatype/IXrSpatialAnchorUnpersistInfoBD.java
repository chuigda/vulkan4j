package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialAnchorUnpersistInfoBD} and {@link XrSpatialAnchorUnpersistInfoBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialAnchorUnpersistInfoBD
    extends IPointer
    permits XrSpatialAnchorUnpersistInfoBD, XrSpatialAnchorUnpersistInfoBD.Ptr
{}
