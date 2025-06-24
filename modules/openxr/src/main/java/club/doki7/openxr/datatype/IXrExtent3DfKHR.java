package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrExtent3DfKHR} and {@link XrExtent3DfKHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrExtent3DfKHR
    extends IPointer
    permits XrExtent3DfKHR, XrExtent3DfKHR.Ptr
{}
