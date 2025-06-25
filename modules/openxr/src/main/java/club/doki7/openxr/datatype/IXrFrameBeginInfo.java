package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrFrameBeginInfo} and {@link XrFrameBeginInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrFrameBeginInfo
    extends IPointer
    permits XrFrameBeginInfo, XrFrameBeginInfo.Ptr
{}
