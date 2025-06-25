package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrFrameWaitInfo} and {@link XrFrameWaitInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrFrameWaitInfo
    extends IPointer
    permits XrFrameWaitInfo, XrFrameWaitInfo.Ptr
{}
