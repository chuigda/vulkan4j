package club.doki7.vulkan.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link VkSwapchainPresentScalingCreateInfoEXT} and {@link VkSwapchainPresentScalingCreateInfoEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IVkSwapchainPresentScalingCreateInfoEXT
    extends IPointer
    permits VkSwapchainPresentScalingCreateInfoEXT, VkSwapchainPresentScalingCreateInfoEXT.Ptr
{}
