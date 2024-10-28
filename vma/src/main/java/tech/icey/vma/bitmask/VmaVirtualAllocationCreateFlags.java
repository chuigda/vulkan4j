package tech.icey.vma.bitmask;

import tech.icey.panama.annotation.enumtype;

// Currently this import is added manually. Update the generator to generate this automatically in the future.
import static tech.icey.vma.bitmask.VmaAllocationCreateFlags.*;

public final class VmaVirtualAllocationCreateFlags {
    public static final int VMA_VIRTUAL_ALLOCATION_CREATE_UPPER_ADDRESS_BIT = VMA_ALLOCATION_CREATE_UPPER_ADDRESS_BIT;
    public static final int VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT = VMA_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT;
    public static final int VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT = VMA_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT;
    public static final int VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_OFFSET_BIT = VMA_ALLOCATION_CREATE_STRATEGY_MIN_OFFSET_BIT;
    public static final int VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MASK = VMA_ALLOCATION_CREATE_STRATEGY_MASK;
    public static final int VMA_VIRTUAL_ALLOCATION_CREATE_FLAG_BITS_MAX_ENUM = 0x7FFFFFFF;

    public static String explain(@enumtype(VmaVirtualAllocationCreateFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();
        if ((flags & VMA_VIRTUAL_ALLOCATION_CREATE_UPPER_ADDRESS_BIT) != 0) {
            sb.append("VMA_VIRTUAL_ALLOCATION_CREATE_UPPER_ADDRESS_BIT ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        if ((flags & VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT) != 0) {
            sb.append("VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        if ((flags & VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT) != 0) {
            sb.append("VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        if ((flags & VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_OFFSET_BIT) != 0) {
            sb.append("VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_OFFSET_BIT ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        if ((flags & VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MASK) != 0) {
            sb.append("VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MASK ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        if ((flags & VMA_VIRTUAL_ALLOCATION_CREATE_FLAG_BITS_MAX_ENUM) != 0) {
            sb.append("VMA_VIRTUAL_ALLOCATION_CREATE_FLAG_BITS_MAX_ENUM ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        return sb.toString();
    }
}
