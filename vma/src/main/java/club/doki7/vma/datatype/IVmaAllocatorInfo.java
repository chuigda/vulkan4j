package club.doki7.vma.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link VmaAllocatorInfo} and {@link VmaAllocatorInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IVmaAllocatorInfo
    extends IPointer
    permits VmaAllocatorInfo, VmaAllocatorInfo.Ptr
{}
