package club.doki7.vma.enumtype;

import club.doki7.ffm.annotation.*;

public final class VmaDefragmentationMoveOperation {
    public static final int COPY = 0;
    public static final int IGNORE = 1;
    public static final int DESTROY = 2;

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
