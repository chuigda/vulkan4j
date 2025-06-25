package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSwapchainCreateInfo} and {@link XrSwapchainCreateInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSwapchainCreateInfo
    extends IPointer
    permits XrSwapchainCreateInfo, XrSwapchainCreateInfo.Ptr
{}
