package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrPersistSpatialEntityCompletionEXT} and {@link XrPersistSpatialEntityCompletionEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrPersistSpatialEntityCompletionEXT
    extends IPointer
    permits XrPersistSpatialEntityCompletionEXT, XrPersistSpatialEntityCompletionEXT.Ptr
{}
