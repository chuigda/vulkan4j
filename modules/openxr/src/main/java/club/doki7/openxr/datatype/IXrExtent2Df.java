package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrExtent2Df} and {@link XrExtent2Df.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrExtent2Df
    extends IPointer
    permits XrExtent2Df, XrExtent2Df.Ptr
{}
