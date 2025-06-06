package club.doki7.vma.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link VmaVirtualAllocationInfo} and {@link VmaVirtualAllocationInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IVmaVirtualAllocationInfo
    extends IPointer
    permits VmaVirtualAllocationInfo, VmaVirtualAllocationInfo.Ptr
{}
