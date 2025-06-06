package club.doki7.vulkan.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link VkDeviceFaultVendorInfoEXT} and {@link VkDeviceFaultVendorInfoEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IVkDeviceFaultVendorInfoEXT
    extends IPointer
    permits VkDeviceFaultVendorInfoEXT, VkDeviceFaultVendorInfoEXT.Ptr
{}
