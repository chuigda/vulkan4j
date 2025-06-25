package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialEntityPersistInfoEXT} and {@link XrSpatialEntityPersistInfoEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialEntityPersistInfoEXT
    extends IPointer
    permits XrSpatialEntityPersistInfoEXT, XrSpatialEntityPersistInfoEXT.Ptr
{}
