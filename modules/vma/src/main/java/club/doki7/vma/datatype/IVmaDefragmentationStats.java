package club.doki7.vma.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link VmaDefragmentationStats} and {@link VmaDefragmentationStats.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IVmaDefragmentationStats
    extends IPointer
    permits VmaDefragmentationStats, VmaDefragmentationStats.Ptr
{}
