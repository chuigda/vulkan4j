package club.doki7.vulkan.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT} and {@link VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IVkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT
    extends IPointer
    permits VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT, VkPhysicalDevicePresentModeFifoLatestReadyFeaturesEXT.Ptr
{}
