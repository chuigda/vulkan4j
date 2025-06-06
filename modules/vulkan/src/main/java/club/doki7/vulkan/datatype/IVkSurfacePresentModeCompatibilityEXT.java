package club.doki7.vulkan.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link VkSurfacePresentModeCompatibilityEXT} and {@link VkSurfacePresentModeCompatibilityEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IVkSurfacePresentModeCompatibilityEXT
    extends IPointer
    permits VkSurfacePresentModeCompatibilityEXT, VkSurfacePresentModeCompatibilityEXT.Ptr
{}
