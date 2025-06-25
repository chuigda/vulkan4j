package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrColor3f} and {@link XrColor3f.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrColor3f
    extends IPointer
    permits XrColor3f, XrColor3f.Ptr
{}
