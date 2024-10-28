package tech.icey.vma.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VmaDefragmentationFlags {
    public static final int VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FAST_BIT = 0x1;
    public static final int VMA_DEFRAGMENTATION_FLAG_ALGORITHM_BALANCED_BIT = 0x2;
    public static final int VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FULL_BIT = 0x4;
    public static final int VMA_DEFRAGMENTATION_FLAG_ALGORITHM_EXTENSIVE_BIT = 0x8;
    public static final int VMA_DEFRAGMENTATION_FLAG_ALGORITHM_MASK =  VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FAST_BIT | VMA_DEFRAGMENTATION_FLAG_ALGORITHM_BALANCED_BIT | VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FULL_BIT | VMA_DEFRAGMENTATION_FLAG_ALGORITHM_EXTENSIVE_BIT;
    public static final int VMA_DEFRAGMENTATION_FLAG_BITS_MAX_ENUM = 0x7FFFFFFF;

    public static String explain(@enumtype(VmaDefragmentationFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();
        if ((flags & VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FAST_BIT) != 0) {
            sb.append("VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FAST_BIT ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        if ((flags & VMA_DEFRAGMENTATION_FLAG_ALGORITHM_BALANCED_BIT) != 0) {
            sb.append("VMA_DEFRAGMENTATION_FLAG_ALGORITHM_BALANCED_BIT ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        if ((flags & VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FULL_BIT) != 0) {
            sb.append("VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FULL_BIT ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        if ((flags & VMA_DEFRAGMENTATION_FLAG_ALGORITHM_EXTENSIVE_BIT) != 0) {
            sb.append("VMA_DEFRAGMENTATION_FLAG_ALGORITHM_EXTENSIVE_BIT ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        if ((flags & VMA_DEFRAGMENTATION_FLAG_ALGORITHM_MASK) != 0) {
            sb.append("VMA_DEFRAGMENTATION_FLAG_ALGORITHM_MASK ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        if ((flags & VMA_DEFRAGMENTATION_FLAG_BITS_MAX_ENUM) != 0) {
            sb.append("VMA_DEFRAGMENTATION_FLAG_BITS_MAX_ENUM ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        return sb.toString();
    }
}
