package club.doki7.vma.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

public final class VmaAllocationCreateFlags {
    public static final int CAN_ALIAS = 0x200;
    public static final int DEDICATED_MEMORY = 0x1;
    public static final int DONT_BIND = 0x80;
    public static final int FLAG_BITS_MAX_ENUM = 0x7fffffff;
    public static final int HOST_ACCESS_ALLOW_TRANSFER_INSTEAD = 0x1000;
    public static final int HOST_ACCESS_RANDOM = 0x800;
    public static final int HOST_ACCESS_SEQUENTIAL_WRITE = 0x400;
    public static final int MAPPED = 0x4;
    public static final int NEVER_ALLOCATE = 0x2;
    public static final int STRATEGY_MIN_MEMORY = 0x10000;
    public static final int STRATEGY_MIN_OFFSET = 0x40000;
    public static final int STRATEGY_MIN_TIME = 0x20000;
    public static final int UPPER_ADDRESS = 0x40;
    public static final int USER_DATA_COPY_STRING = 0x20;
    public static final int WITHIN_BUDGET = 0x100;
    public static final int STRATEGY_BEST_FIT = STRATEGY_MIN_MEMORY;
    public static final int STRATEGY_FIRST_FIT = STRATEGY_MIN_TIME;
    public static final int STRATEGY_MASK = STRATEGY_MIN_MEMORY | STRATEGY_MIN_TIME | STRATEGY_MIN_OFFSET;

    public static String explain(@EnumType(VmaAllocationCreateFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & CAN_ALIAS) != 0) {
            detectedFlagBits.add("VMA_ALLOCATION_CREATE_CAN_ALIAS_BIT");
        }
        if ((flags & DEDICATED_MEMORY) != 0) {
            detectedFlagBits.add("VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT");
        }
        if ((flags & DONT_BIND) != 0) {
            detectedFlagBits.add("VMA_ALLOCATION_CREATE_DONT_BIND_BIT");
        }
        if ((flags & FLAG_BITS_MAX_ENUM) != 0) {
            detectedFlagBits.add("VMA_ALLOCATION_CREATE_FLAG_BITS_MAX_ENUM");
        }
        if ((flags & HOST_ACCESS_ALLOW_TRANSFER_INSTEAD) != 0) {
            detectedFlagBits.add("VMA_ALLOCATION_CREATE_HOST_ACCESS_ALLOW_TRANSFER_INSTEAD_BIT");
        }
        if ((flags & HOST_ACCESS_RANDOM) != 0) {
            detectedFlagBits.add("VMA_ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT");
        }
        if ((flags & HOST_ACCESS_SEQUENTIAL_WRITE) != 0) {
            detectedFlagBits.add("VMA_ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT");
        }
        if ((flags & MAPPED) != 0) {
            detectedFlagBits.add("VMA_ALLOCATION_CREATE_MAPPED_BIT");
        }
        if ((flags & NEVER_ALLOCATE) != 0) {
            detectedFlagBits.add("VMA_ALLOCATION_CREATE_NEVER_ALLOCATE_BIT");
        }
        if ((flags & STRATEGY_MIN_MEMORY) != 0) {
            detectedFlagBits.add("VMA_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT");
        }
        if ((flags & STRATEGY_MIN_OFFSET) != 0) {
            detectedFlagBits.add("VMA_ALLOCATION_CREATE_STRATEGY_MIN_OFFSET_BIT");
        }
        if ((flags & STRATEGY_MIN_TIME) != 0) {
            detectedFlagBits.add("VMA_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT");
        }
        if ((flags & UPPER_ADDRESS) != 0) {
            detectedFlagBits.add("VMA_ALLOCATION_CREATE_UPPER_ADDRESS_BIT");
        }
        if ((flags & USER_DATA_COPY_STRING) != 0) {
            detectedFlagBits.add("VMA_ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT");
        }
        if ((flags & WITHIN_BUDGET) != 0) {
            detectedFlagBits.add("VMA_ALLOCATION_CREATE_WITHIN_BUDGET_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VmaAllocationCreateFlags() {}
}
