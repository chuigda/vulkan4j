package club.doki7.vulkan.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link VkPhysicalDeviceMemoryDecompressionPropertiesNV} and {@link VkPhysicalDeviceMemoryDecompressionPropertiesNV.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IVkPhysicalDeviceMemoryDecompressionPropertiesNV
    extends IPointer
    permits VkPhysicalDeviceMemoryDecompressionPropertiesNV, VkPhysicalDeviceMemoryDecompressionPropertiesNV.Ptr
{}
