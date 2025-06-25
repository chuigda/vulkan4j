package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialComponentDataQueryResultEXT} and {@link XrSpatialComponentDataQueryResultEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialComponentDataQueryResultEXT
    extends IPointer
    permits XrSpatialComponentDataQueryResultEXT, XrSpatialComponentDataQueryResultEXT.Ptr
{}
