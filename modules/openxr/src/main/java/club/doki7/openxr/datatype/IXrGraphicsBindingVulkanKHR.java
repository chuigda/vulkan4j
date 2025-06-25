package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrGraphicsBindingVulkanKHR} and {@link XrGraphicsBindingVulkanKHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrGraphicsBindingVulkanKHR
    extends IPointer
    permits XrGraphicsBindingVulkanKHR, XrGraphicsBindingVulkanKHR.Ptr
{}
