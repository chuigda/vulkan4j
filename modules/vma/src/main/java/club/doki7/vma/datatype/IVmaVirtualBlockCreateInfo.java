package club.doki7.vma.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link VmaVirtualBlockCreateInfo} and {@link VmaVirtualBlockCreateInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IVmaVirtualBlockCreateInfo
    extends IPointer
    permits VmaVirtualBlockCreateInfo, VmaVirtualBlockCreateInfo.Ptr
{}
