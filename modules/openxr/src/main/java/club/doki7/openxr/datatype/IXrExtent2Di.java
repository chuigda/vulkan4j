package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrExtent2Di} and {@link XrExtent2Di.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrExtent2Di
    extends IPointer
    permits XrExtent2Di, XrExtent2Di.Ptr
{}
