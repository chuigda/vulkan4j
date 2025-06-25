package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrFrameEndInfo} and {@link XrFrameEndInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrFrameEndInfo
    extends IPointer
    permits XrFrameEndInfo, XrFrameEndInfo.Ptr
{}
