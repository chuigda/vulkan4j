package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrRect2Di} and {@link XrRect2Di.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrRect2Di
    extends IPointer
    permits XrRect2Di, XrRect2Di.Ptr
{}
