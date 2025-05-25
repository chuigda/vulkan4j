package club.doki7.vma.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

public final class VmaAllocationCreateFlags {
    public static final int CAN_ALIAS = 0x00000200;
    public static final int DEDICATED_MEMORY = 0x00000001;
    public static final int DONT_BIND = 0x00000080;
    public static final int FLAG_BITS_MAX_ENUM = 0x7FFFFFFF;
    public static final int HOST_ACCESS_ALLOW_TRANSFER_INSTEAD = 0x00001000;
    public static final int HOST_ACCESS_RANDOM = 0x00000800;
    public static final int HOST_ACCESS_SEQUENTIAL_WRITE = 0x00000400;
    public static final int MAPPED = 0x00000004;
    public static final int NEVER_ALLOCATE = 0x00000002;
    public static final int STRATEGY_BEST_FIT = VMA_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT;
    public static final int STRATEGY_FIRST_FIT = VMA_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT;
    public static final int STRATEGY_MASK = VMA_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT | VMA_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT | VMA_ALLOCATION_CREATE_STRATEGY_MIN_OFFSET_BIT;
    public static final int STRATEGY_MIN_MEMORY = 0x00010000;
    public static final int STRATEGY_MIN_OFFSET = 0x00040000;
    public static final int STRATEGY_MIN_TIME = 0x00020000;
    public static final int UPPER_ADDRESS = 0x00000040;
    public static final int USER_DATA_COPY_STRING = 0x00000020;
    public static final int WITHIN_BUDGET = 0x00000100;

    public static String explain(@EnumType(VmaAllocationCreateFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VmaAllocationCreateFlags() {}
}
