package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialPersistenceDataEXT} and {@link XrSpatialPersistenceDataEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialPersistenceDataEXT
    extends IPointer
    permits XrSpatialPersistenceDataEXT, XrSpatialPersistenceDataEXT.Ptr
{}
