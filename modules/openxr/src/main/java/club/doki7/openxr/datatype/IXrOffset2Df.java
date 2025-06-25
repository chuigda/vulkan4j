package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrOffset2Df} and {@link XrOffset2Df.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrOffset2Df
    extends IPointer
    permits XrOffset2Df, XrOffset2Df.Ptr
{}
