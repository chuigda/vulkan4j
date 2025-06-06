package club.doki7.vulkan.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link VkSurfacePresentModeEXT} and {@link VkSurfacePresentModeEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IVkSurfacePresentModeEXT
    extends IPointer
    permits VkSurfacePresentModeEXT, VkSurfacePresentModeEXT.Ptr
{}
