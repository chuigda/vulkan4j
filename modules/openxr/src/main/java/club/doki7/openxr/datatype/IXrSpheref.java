package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpheref} and {@link XrSpheref.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpheref
    extends IPointer
    permits XrSpheref, XrSpheref.Ptr
{}
