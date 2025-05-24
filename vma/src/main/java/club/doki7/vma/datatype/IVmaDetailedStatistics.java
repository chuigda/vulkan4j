package club.doki7.vma.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link VmaDetailedStatistics} and {@link VmaDetailedStatistics.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IVmaDetailedStatistics
    extends IPointer
    permits VmaDetailedStatistics, VmaDetailedStatistics.Ptr
{}
