package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSwapchainImageVulkan2KHR} and {@link XrSwapchainImageVulkan2KHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSwapchainImageVulkan2KHR
    extends IPointer
    permits XrSwapchainImageVulkan2KHR, XrSwapchainImageVulkan2KHR.Ptr
{}
