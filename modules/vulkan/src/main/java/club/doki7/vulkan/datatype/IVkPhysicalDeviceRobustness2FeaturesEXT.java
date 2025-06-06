package club.doki7.vulkan.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link VkPhysicalDeviceRobustness2FeaturesEXT} and {@link VkPhysicalDeviceRobustness2FeaturesEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IVkPhysicalDeviceRobustness2FeaturesEXT
    extends IPointer
    permits VkPhysicalDeviceRobustness2FeaturesEXT, VkPhysicalDeviceRobustness2FeaturesEXT.Ptr
{}
