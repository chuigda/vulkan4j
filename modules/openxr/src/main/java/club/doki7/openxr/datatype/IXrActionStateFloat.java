package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrActionStateFloat} and {@link XrActionStateFloat.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrActionStateFloat
    extends IPointer
    permits XrActionStateFloat, XrActionStateFloat.Ptr
{}
