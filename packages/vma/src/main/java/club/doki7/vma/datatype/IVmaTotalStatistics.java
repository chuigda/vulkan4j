package club.doki7.vma.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link VmaTotalStatistics} and {@link VmaTotalStatistics.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IVmaTotalStatistics
    extends IPointer
    permits VmaTotalStatistics, VmaTotalStatistics.Ptr
{}
