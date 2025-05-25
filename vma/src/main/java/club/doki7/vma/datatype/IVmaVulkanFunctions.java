package club.doki7.vma.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link VmaVulkanFunctions} and {@link VmaVulkanFunctions.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IVmaVulkanFunctions
    extends IPointer
    permits VmaVulkanFunctions, VmaVulkanFunctions.Ptr
{}
