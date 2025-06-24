package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrColor4f} and {@link XrColor4f.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrColor4f
    extends IPointer
    permits XrColor4f, XrColor4f.Ptr
{}
