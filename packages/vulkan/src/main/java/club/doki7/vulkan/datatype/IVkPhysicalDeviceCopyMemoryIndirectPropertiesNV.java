package club.doki7.vulkan.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link VkPhysicalDeviceCopyMemoryIndirectPropertiesNV} and {@link VkPhysicalDeviceCopyMemoryIndirectPropertiesNV.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IVkPhysicalDeviceCopyMemoryIndirectPropertiesNV
    extends IPointer
    permits VkPhysicalDeviceCopyMemoryIndirectPropertiesNV, VkPhysicalDeviceCopyMemoryIndirectPropertiesNV.Ptr
{}
