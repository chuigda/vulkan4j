package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrUuidEXT} and {@link XrUuidEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrUuidEXT
    extends IPointer
    permits XrUuidEXT, XrUuidEXT.Ptr
{}
