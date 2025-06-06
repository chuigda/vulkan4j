package club.doki7.vma.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link VmaVirtualAllocationCreateInfo} and {@link VmaVirtualAllocationCreateInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IVmaVirtualAllocationCreateInfo
    extends IPointer
    permits VmaVirtualAllocationCreateInfo, VmaVirtualAllocationCreateInfo.Ptr
{}
