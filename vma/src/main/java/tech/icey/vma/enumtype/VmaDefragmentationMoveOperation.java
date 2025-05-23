package tech.icey.vma.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VmaDefragmentationMoveOperation {
    public static final int VMA_DEFRAGMENTATION_MOVE_OPERATION_COPY = 0;
    public static final int VMA_DEFRAGMENTATION_MOVE_OPERATION_IGNORE = 1;
    public static final int VMA_DEFRAGMENTATION_MOVE_OPERATION_DESTROY = 2;

    public static String explain(@enumtype(VmaDefragmentationMoveOperation.class) int value) {
        return switch (value) {
            case VmaDefragmentationMoveOperation.VMA_DEFRAGMENTATION_MOVE_OPERATION_COPY -> "VMA_DEFRAGMENTATION_MOVE_OPERATION_COPY";
            case VmaDefragmentationMoveOperation.VMA_DEFRAGMENTATION_MOVE_OPERATION_IGNORE -> "VMA_DEFRAGMENTATION_MOVE_OPERATION_IGNORE";
            case VmaDefragmentationMoveOperation.VMA_DEFRAGMENTATION_MOVE_OPERATION_DESTROY -> "VMA_DEFRAGMENTATION_MOVE_OPERATION_DESTROY";
            default -> "Unknown VmaDefragmentationMoveOperation: " + value;
        };
    }
}
