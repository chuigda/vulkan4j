package club.doki7.vma.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link VmaStatistics} and {@link VmaStatistics.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IVmaStatistics
    extends IPointer
    permits VmaStatistics, VmaStatistics.Ptr
{}
