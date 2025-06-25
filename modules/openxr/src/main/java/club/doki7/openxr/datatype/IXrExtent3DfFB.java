package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrExtent3DfFB} and {@link XrExtent3DfFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrExtent3DfFB
    extends IPointer
    permits XrExtent3DfFB, XrExtent3DfFB.Ptr
{}
