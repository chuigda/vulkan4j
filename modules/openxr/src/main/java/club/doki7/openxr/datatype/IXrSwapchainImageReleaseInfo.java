package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSwapchainImageReleaseInfo} and {@link XrSwapchainImageReleaseInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSwapchainImageReleaseInfo
    extends IPointer
    permits XrSwapchainImageReleaseInfo, XrSwapchainImageReleaseInfo.Ptr
{}
