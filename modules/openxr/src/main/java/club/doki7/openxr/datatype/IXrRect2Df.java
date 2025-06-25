package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrRect2Df} and {@link XrRect2Df.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrRect2Df
    extends IPointer
    permits XrRect2Df, XrRect2Df.Ptr
{}
