package club.doki7.vma.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

public final class VmaVirtualAllocationCreateFlags {
    public static final int FLAG_BITS_MAX_ENUM = 0x7fffffff;
    public static final int STRATEGY_MASK = VmaAllocationCreateFlags.STRATEGY_MASK;
    public static final int STRATEGY_MIN_MEMORY = VmaAllocationCreateFlags.STRATEGY_MIN_MEMORY;
    public static final int STRATEGY_MIN_OFFSET = VmaAllocationCreateFlags.STRATEGY_MIN_OFFSET;
    public static final int STRATEGY_MIN_TIME = VmaAllocationCreateFlags.STRATEGY_MIN_TIME;
    public static final int UPPER_ADDRESS = VmaAllocationCreateFlags.UPPER_ADDRESS;

    public static String explain(@EnumType(VmaVirtualAllocationCreateFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & FLAG_BITS_MAX_ENUM) != 0) {
            detectedFlagBits.add("VMA_VIRTUAL_ALLOCATION_CREATE_FLAG_BITS_MAX_ENUM");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VmaVirtualAllocationCreateFlags() {}
}
