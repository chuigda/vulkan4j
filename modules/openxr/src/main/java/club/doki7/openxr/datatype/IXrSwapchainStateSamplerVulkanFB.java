package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSwapchainStateSamplerVulkanFB} and {@link XrSwapchainStateSamplerVulkanFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSwapchainStateSamplerVulkanFB
    extends IPointer
    permits XrSwapchainStateSamplerVulkanFB, XrSwapchainStateSamplerVulkanFB.Ptr
{}
