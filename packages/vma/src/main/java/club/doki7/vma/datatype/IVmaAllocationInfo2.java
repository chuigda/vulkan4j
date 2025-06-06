package club.doki7.vma.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link VmaAllocationInfo2} and {@link VmaAllocationInfo2.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IVmaAllocationInfo2
    extends IPointer
    permits VmaAllocationInfo2, VmaAllocationInfo2.Ptr
{}
