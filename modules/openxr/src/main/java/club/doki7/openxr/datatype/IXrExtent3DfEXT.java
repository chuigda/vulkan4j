package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrExtent3DfEXT} and {@link XrExtent3DfEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrExtent3DfEXT
    extends IPointer
    permits XrExtent3DfEXT, XrExtent3DfEXT.Ptr
{}
