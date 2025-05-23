package club.doki7.vulkan.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link VkSwapchainPresentModeInfoEXT} and {@link VkSwapchainPresentModeInfoEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IVkSwapchainPresentModeInfoEXT
    extends IPointer
    permits VkSwapchainPresentModeInfoEXT, VkSwapchainPresentModeInfoEXT.Ptr
{}
