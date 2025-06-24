package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialComponentPersistenceListEXT} and {@link XrSpatialComponentPersistenceListEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialComponentPersistenceListEXT
    extends IPointer
    permits XrSpatialComponentPersistenceListEXT, XrSpatialComponentPersistenceListEXT.Ptr
{}
