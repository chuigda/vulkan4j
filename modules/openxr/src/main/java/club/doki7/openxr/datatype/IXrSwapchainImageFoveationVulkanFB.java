package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSwapchainImageFoveationVulkanFB} and {@link XrSwapchainImageFoveationVulkanFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSwapchainImageFoveationVulkanFB
    extends IPointer
    permits XrSwapchainImageFoveationVulkanFB, XrSwapchainImageFoveationVulkanFB.Ptr
{}
