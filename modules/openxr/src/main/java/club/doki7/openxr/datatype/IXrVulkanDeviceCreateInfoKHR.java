package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrVulkanDeviceCreateInfoKHR} and {@link XrVulkanDeviceCreateInfoKHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrVulkanDeviceCreateInfoKHR
    extends IPointer
    permits XrVulkanDeviceCreateInfoKHR, XrVulkanDeviceCreateInfoKHR.Ptr
{}
