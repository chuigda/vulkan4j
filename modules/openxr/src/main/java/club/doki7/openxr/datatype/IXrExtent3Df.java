package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrExtent3Df} and {@link XrExtent3Df.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrExtent3Df
    extends IPointer
    permits XrExtent3Df, XrExtent3Df.Ptr
{}
