package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSwapchainImageAcquireInfo} and {@link XrSwapchainImageAcquireInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSwapchainImageAcquireInfo
    extends IPointer
    permits XrSwapchainImageAcquireInfo, XrSwapchainImageAcquireInfo.Ptr
{}
