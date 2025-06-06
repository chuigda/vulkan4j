package club.doki7.vma.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link VmaDefragmentationInfo} and {@link VmaDefragmentationInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IVmaDefragmentationInfo
    extends IPointer
    permits VmaDefragmentationInfo, VmaDefragmentationInfo.Ptr
{}
