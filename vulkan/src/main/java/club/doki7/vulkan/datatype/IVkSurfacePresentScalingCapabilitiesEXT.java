package club.doki7.vulkan.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link VkSurfacePresentScalingCapabilitiesEXT} and {@link VkSurfacePresentScalingCapabilitiesEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IVkSurfacePresentScalingCapabilitiesEXT
    extends IPointer
    permits VkSurfacePresentScalingCapabilitiesEXT, VkSurfacePresentScalingCapabilitiesEXT.Ptr
{}
