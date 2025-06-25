package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrActionStateBoolean} and {@link XrActionStateBoolean.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrActionStateBoolean
    extends IPointer
    permits XrActionStateBoolean, XrActionStateBoolean.Ptr
{}
