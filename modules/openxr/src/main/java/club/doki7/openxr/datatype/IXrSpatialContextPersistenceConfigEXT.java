package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialContextPersistenceConfigEXT} and {@link XrSpatialContextPersistenceConfigEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialContextPersistenceConfigEXT
    extends IPointer
    permits XrSpatialContextPersistenceConfigEXT, XrSpatialContextPersistenceConfigEXT.Ptr
{}
