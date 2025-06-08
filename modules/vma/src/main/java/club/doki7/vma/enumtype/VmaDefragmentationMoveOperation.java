package club.doki7.vma.enumtype;

/// Operation performed on single defragmentation move. See structure {@code VmaDefragmentationMove}.
///
public final class VmaDefragmentationMoveOperation {
    /// Buffer/image has been recreated at `dstTmpAllocation`, data has been copied, old buffer/image has been destroyed. `srcAllocation` should be changed to point to the new place. This is the default value set by vmaBeginDefragmentationPass().
    public static final int COPY = 0x0;

    /// Set this value if you cannot move the allocation. New place reserved at `dstTmpAllocation` will be freed. `srcAllocation` will remain unchanged.
    public static final int IGNORE = 0x1;

    /// Set this value if you decide to abandon the allocation and you destroyed the buffer/image. New place reserved at `dstTmpAllocation` will be freed, along with `srcAllocation`, which will be destroyed.
    public static final int DESTROY = 0x2;

    public static String explain(@EnumType(VmaDefragmentationMoveOperation.class) int value) {
        return switch (value) {
            case VmaDefragmentationMoveOperation.COPY -> "VMA_DEFRAGMENTATION_MOVE_OPERATION_COPY";
            case VmaDefragmentationMoveOperation.DESTROY -> "VMA_DEFRAGMENTATION_MOVE_OPERATION_DESTROY";
            case VmaDefragmentationMoveOperation.IGNORE -> "VMA_DEFRAGMENTATION_MOVE_OPERATION_IGNORE";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VmaDefragmentationMoveOperation() {}
}
