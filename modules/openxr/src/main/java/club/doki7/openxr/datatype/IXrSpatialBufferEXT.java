package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialBufferEXT} and {@link XrSpatialBufferEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialBufferEXT
    extends IPointer
    permits XrSpatialBufferEXT, XrSpatialBufferEXT.Ptr
{}
