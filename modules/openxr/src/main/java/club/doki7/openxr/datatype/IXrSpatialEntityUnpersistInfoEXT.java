package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialEntityUnpersistInfoEXT} and {@link XrSpatialEntityUnpersistInfoEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialEntityUnpersistInfoEXT
    extends IPointer
    permits XrSpatialEntityUnpersistInfoEXT, XrSpatialEntityUnpersistInfoEXT.Ptr
{}
