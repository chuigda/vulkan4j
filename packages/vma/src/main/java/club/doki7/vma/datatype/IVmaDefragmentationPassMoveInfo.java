package club.doki7.vma.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link VmaDefragmentationPassMoveInfo} and {@link VmaDefragmentationPassMoveInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IVmaDefragmentationPassMoveInfo
    extends IPointer
    permits VmaDefragmentationPassMoveInfo, VmaDefragmentationPassMoveInfo.Ptr
{}
