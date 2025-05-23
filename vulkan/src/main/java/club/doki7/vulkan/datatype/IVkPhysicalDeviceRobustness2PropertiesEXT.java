package club.doki7.vulkan.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link VkPhysicalDeviceRobustness2PropertiesEXT} and {@link VkPhysicalDeviceRobustness2PropertiesEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IVkPhysicalDeviceRobustness2PropertiesEXT
    extends IPointer
    permits VkPhysicalDeviceRobustness2PropertiesEXT, VkPhysicalDeviceRobustness2PropertiesEXT.Ptr
{}
