package club.doki7.vma.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

public final class VmaVirtualAllocationCreateFlags {
    public static final int FLAG_BITS_MAX_ENUM = 0x7FFFFFFF;
    public static final int STRATEGY_MASK = VMA_ALLOCATION_CREATE_STRATEGY_MASK;
    public static final int STRATEGY_MIN_MEMORY = VMA_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT;
    public static final int STRATEGY_MIN_OFFSET = VMA_ALLOCATION_CREATE_STRATEGY_MIN_OFFSET_BIT;
    public static final int STRATEGY_MIN_TIME = VMA_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT;
    public static final int UPPER_ADDRESS = VMA_ALLOCATION_CREATE_UPPER_ADDRESS_BIT;

    public static String explain(@EnumType(VmaVirtualAllocationCreateFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VmaVirtualAllocationCreateFlags() {}
}
