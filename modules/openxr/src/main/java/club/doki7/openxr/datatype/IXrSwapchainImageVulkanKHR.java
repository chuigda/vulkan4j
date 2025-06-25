package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSwapchainImageVulkanKHR} and {@link XrSwapchainImageVulkanKHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSwapchainImageVulkanKHR
    extends IPointer
    permits XrSwapchainImageVulkanKHR, XrSwapchainImageVulkanKHR.Ptr
{}
