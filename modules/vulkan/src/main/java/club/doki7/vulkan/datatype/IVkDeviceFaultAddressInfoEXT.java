package club.doki7.vulkan.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link VkDeviceFaultAddressInfoEXT} and {@link VkDeviceFaultAddressInfoEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IVkDeviceFaultAddressInfoEXT
    extends IPointer
    permits VkDeviceFaultAddressInfoEXT, VkDeviceFaultAddressInfoEXT.Ptr
{}
