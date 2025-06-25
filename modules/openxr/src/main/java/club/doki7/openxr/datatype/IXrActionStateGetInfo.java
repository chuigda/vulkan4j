package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrActionStateGetInfo} and {@link XrActionStateGetInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrActionStateGetInfo
    extends IPointer
    permits XrActionStateGetInfo, XrActionStateGetInfo.Ptr
{}
