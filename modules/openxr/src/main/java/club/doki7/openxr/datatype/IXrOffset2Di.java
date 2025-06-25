package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrOffset2Di} and {@link XrOffset2Di.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrOffset2Di
    extends IPointer
    permits XrOffset2Di, XrOffset2Di.Ptr
{}
