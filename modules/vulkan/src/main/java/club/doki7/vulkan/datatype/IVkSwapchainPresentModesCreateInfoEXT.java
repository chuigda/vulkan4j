package club.doki7.vulkan.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link VkSwapchainPresentModesCreateInfoEXT} and {@link VkSwapchainPresentModesCreateInfoEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IVkSwapchainPresentModesCreateInfoEXT
    extends IPointer
    permits VkSwapchainPresentModesCreateInfoEXT, VkSwapchainPresentModesCreateInfoEXT.Ptr
{}
