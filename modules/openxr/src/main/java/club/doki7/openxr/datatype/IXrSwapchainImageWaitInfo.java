package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSwapchainImageWaitInfo} and {@link XrSwapchainImageWaitInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSwapchainImageWaitInfo
    extends IPointer
    permits XrSwapchainImageWaitInfo, XrSwapchainImageWaitInfo.Ptr
{}
