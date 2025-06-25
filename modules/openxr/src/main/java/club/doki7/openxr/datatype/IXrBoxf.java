package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrBoxf} and {@link XrBoxf.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrBoxf
    extends IPointer
    permits XrBoxf, XrBoxf.Ptr
{}
