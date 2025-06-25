package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrActionsSyncInfo} and {@link XrActionsSyncInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrActionsSyncInfo
    extends IPointer
    permits XrActionsSyncInfo, XrActionsSyncInfo.Ptr
{}
