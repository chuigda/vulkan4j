package club.doki7.vma.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link VmaBudget} and {@link VmaBudget.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IVmaBudget
    extends IPointer
    permits VmaBudget, VmaBudget.Ptr
{}
