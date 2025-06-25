package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrApplicationInfo} and {@link XrApplicationInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrApplicationInfo
    extends IPointer
    permits XrApplicationInfo, XrApplicationInfo.Ptr
{}
