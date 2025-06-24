package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrVulkanGraphicsDeviceGetInfoKHR} and {@link XrVulkanGraphicsDeviceGetInfoKHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrVulkanGraphicsDeviceGetInfoKHR
    extends IPointer
    permits XrVulkanGraphicsDeviceGetInfoKHR, XrVulkanGraphicsDeviceGetInfoKHR.Ptr
{}
