package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrActionStateVector2f} and {@link XrActionStateVector2f.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrActionStateVector2f
    extends IPointer
    permits XrActionStateVector2f, XrActionStateVector2f.Ptr
{}
