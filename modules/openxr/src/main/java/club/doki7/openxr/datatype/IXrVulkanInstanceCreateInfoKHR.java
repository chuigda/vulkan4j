package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrVulkanInstanceCreateInfoKHR} and {@link XrVulkanInstanceCreateInfoKHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrVulkanInstanceCreateInfoKHR
    extends IPointer
    permits XrVulkanInstanceCreateInfoKHR, XrVulkanInstanceCreateInfoKHR.Ptr
{}
