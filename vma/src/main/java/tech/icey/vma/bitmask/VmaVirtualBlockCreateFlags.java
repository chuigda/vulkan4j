package tech.icey.vma.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VmaVirtualBlockCreateFlags {
    public static final int VMA_VIRTUAL_BLOCK_CREATE_LINEAR_ALGORITHM_BIT = 0x00000001;
    public static final int VMA_VIRTUAL_BLOCK_CREATE_ALGORITHM_MASK =  VMA_VIRTUAL_BLOCK_CREATE_LINEAR_ALGORITHM_BIT;
    public static final int VMA_VIRTUAL_BLOCK_CREATE_FLAG_BITS_MAX_ENUM = 0x7FFFFFFF;

    public static String explain(@enumtype(VmaVirtualBlockCreateFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();
        if ((flags & VMA_VIRTUAL_BLOCK_CREATE_LINEAR_ALGORITHM_BIT) != 0) {
            sb.append("VMA_VIRTUAL_BLOCK_CREATE_LINEAR_ALGORITHM_BIT ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        if ((flags & VMA_VIRTUAL_BLOCK_CREATE_ALGORITHM_MASK) != 0) {
            sb.append("VMA_VIRTUAL_BLOCK_CREATE_ALGORITHM_MASK ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        if ((flags & VMA_VIRTUAL_BLOCK_CREATE_FLAG_BITS_MAX_ENUM) != 0) {
            sb.append("VMA_VIRTUAL_BLOCK_CREATE_FLAG_BITS_MAX_ENUM ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        return sb.toString();
    }
}
