package club.doki7.vma.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link VmaAllocationInfo} and {@link VmaAllocationInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IVmaAllocationInfo
    extends IPointer
    permits VmaAllocationInfo, VmaAllocationInfo.Ptr
{}
