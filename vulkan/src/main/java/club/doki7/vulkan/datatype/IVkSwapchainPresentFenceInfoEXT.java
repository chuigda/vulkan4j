package club.doki7.vulkan.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link VkSwapchainPresentFenceInfoEXT} and {@link VkSwapchainPresentFenceInfoEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IVkSwapchainPresentFenceInfoEXT
    extends IPointer
    permits VkSwapchainPresentFenceInfoEXT, VkSwapchainPresentFenceInfoEXT.Ptr
{}
