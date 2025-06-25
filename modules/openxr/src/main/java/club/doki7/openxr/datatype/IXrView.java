package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrView} and {@link XrView.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrView
    extends IPointer
    permits XrView, XrView.Ptr
{}
