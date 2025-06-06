package club.doki7.vma.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link VmaPoolCreateInfo} and {@link VmaPoolCreateInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IVmaPoolCreateInfo
    extends IPointer
    permits VmaPoolCreateInfo, VmaPoolCreateInfo.Ptr
{}
