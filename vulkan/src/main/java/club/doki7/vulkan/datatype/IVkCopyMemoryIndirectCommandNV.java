package club.doki7.vulkan.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link VkCopyMemoryIndirectCommandNV} and {@link VkCopyMemoryIndirectCommandNV.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IVkCopyMemoryIndirectCommandNV
    extends IPointer
    permits VkCopyMemoryIndirectCommandNV, VkCopyMemoryIndirectCommandNV.Ptr
{}
