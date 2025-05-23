package tech.icey.vma.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VmaAllocationCreateFlags {
    public static final int VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT = 0x00000001;
    public static final int VMA_ALLOCATION_CREATE_NEVER_ALLOCATE_BIT = 0x00000002;
    public static final int VMA_ALLOCATION_CREATE_MAPPED_BIT = 0x00000004;
    public static final int VMA_ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT = 0x00000020;
    public static final int VMA_ALLOCATION_CREATE_UPPER_ADDRESS_BIT = 0x00000040;
    public static final int VMA_ALLOCATION_CREATE_DONT_BIND_BIT = 0x00000080;
    public static final int VMA_ALLOCATION_CREATE_WITHIN_BUDGET_BIT = 0x00000100;
    public static final int VMA_ALLOCATION_CREATE_CAN_ALIAS_BIT = 0x00000200;
    public static final int VMA_ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT = 0x00000400;
    public static final int VMA_ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT = 0x00000800;
    public static final int VMA_ALLOCATION_CREATE_HOST_ACCESS_ALLOW_TRANSFER_INSTEAD_BIT = 0x00001000;
    public static final int VMA_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT = 0x00010000;
    public static final int VMA_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT = 0x00020000;
    public static final int VMA_ALLOCATION_CREATE_STRATEGY_MIN_OFFSET_BIT = 0x00040000;
    public static final int VMA_ALLOCATION_CREATE_STRATEGY_BEST_FIT_BIT = VMA_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT;
    public static final int VMA_ALLOCATION_CREATE_STRATEGY_FIRST_FIT_BIT = VMA_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT;
    public static final int VMA_ALLOCATION_CREATE_STRATEGY_MASK =  VMA_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT | VMA_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT | VMA_ALLOCATION_CREATE_STRATEGY_MIN_OFFSET_BIT;
    public static final int VMA_ALLOCATION_CREATE_FLAG_BITS_MAX_ENUM = 0x7FFFFFFF;

    public static String explain(@enumtype(VmaAllocationCreateFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();
        if ((flags & VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT) != 0) {
            sb.append("VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        if ((flags & VMA_ALLOCATION_CREATE_NEVER_ALLOCATE_BIT) != 0) {
            sb.append("VMA_ALLOCATION_CREATE_NEVER_ALLOCATE_BIT ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        if ((flags & VMA_ALLOCATION_CREATE_MAPPED_BIT) != 0) {
            sb.append("VMA_ALLOCATION_CREATE_MAPPED_BIT ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        if ((flags & VMA_ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT) != 0) {
            sb.append("VMA_ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        if ((flags & VMA_ALLOCATION_CREATE_UPPER_ADDRESS_BIT) != 0) {
            sb.append("VMA_ALLOCATION_CREATE_UPPER_ADDRESS_BIT ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        if ((flags & VMA_ALLOCATION_CREATE_DONT_BIND_BIT) != 0) {
            sb.append("VMA_ALLOCATION_CREATE_DONT_BIND_BIT ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        if ((flags & VMA_ALLOCATION_CREATE_WITHIN_BUDGET_BIT) != 0) {
            sb.append("VMA_ALLOCATION_CREATE_WITHIN_BUDGET_BIT ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        if ((flags & VMA_ALLOCATION_CREATE_CAN_ALIAS_BIT) != 0) {
            sb.append("VMA_ALLOCATION_CREATE_CAN_ALIAS_BIT ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        if ((flags & VMA_ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT) != 0) {
            sb.append("VMA_ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        if ((flags & VMA_ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT) != 0) {
            sb.append("VMA_ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        if ((flags & VMA_ALLOCATION_CREATE_HOST_ACCESS_ALLOW_TRANSFER_INSTEAD_BIT) != 0) {
            sb.append("VMA_ALLOCATION_CREATE_HOST_ACCESS_ALLOW_TRANSFER_INSTEAD_BIT ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        if ((flags & VMA_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT) != 0) {
            sb.append("VMA_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        if ((flags & VMA_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT) != 0) {
            sb.append("VMA_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        if ((flags & VMA_ALLOCATION_CREATE_STRATEGY_MIN_OFFSET_BIT) != 0) {
            sb.append("VMA_ALLOCATION_CREATE_STRATEGY_MIN_OFFSET_BIT ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        if ((flags & VMA_ALLOCATION_CREATE_STRATEGY_BEST_FIT_BIT) != 0) {
            sb.append("VMA_ALLOCATION_CREATE_STRATEGY_BEST_FIT_BIT ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        if ((flags & VMA_ALLOCATION_CREATE_STRATEGY_FIRST_FIT_BIT) != 0) {
            sb.append("VMA_ALLOCATION_CREATE_STRATEGY_FIRST_FIT_BIT ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        if ((flags & VMA_ALLOCATION_CREATE_STRATEGY_MASK) != 0) {
            sb.append("VMA_ALLOCATION_CREATE_STRATEGY_MASK ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        if ((flags & VMA_ALLOCATION_CREATE_FLAG_BITS_MAX_ENUM) != 0) {
            sb.append("VMA_ALLOCATION_CREATE_FLAG_BITS_MAX_ENUM ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        return sb.toString();
    }
}
