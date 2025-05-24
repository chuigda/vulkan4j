package club.doki7.vma.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link VmaDefragmentationMove} and {@link VmaDefragmentationMove.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IVmaDefragmentationMove
    extends IPointer
    permits VmaDefragmentationMove, VmaDefragmentationMove.Ptr
{}
