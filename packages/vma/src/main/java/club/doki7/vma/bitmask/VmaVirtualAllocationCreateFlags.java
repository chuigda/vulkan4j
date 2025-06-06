package club.doki7.vma.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// Flags to be passed as VmaVirtualAllocationCreateInfo::flags.
///
public final class VmaVirtualAllocationCreateFlags {
    public static final int FLAG_BITS_MAX_ENUM = 0x7fffffff;

    /// A bit mask to extract only `STRATEGY` bits from entire set of flags.
    ///
    /// These strategy flags are binary compatible with equivalent flags in {@code VmaAllocationCreateFlagBits}.
    public static final int STRATEGY_MASK = VmaAllocationCreateFlags.STRATEGY_MASK;

    /// Allocation strategy that tries to minimize memory usage.
    public static final int STRATEGY_MIN_MEMORY = VmaAllocationCreateFlags.STRATEGY_MIN_MEMORY;

    /// Allocation strategy that chooses always the lowest offset in available space.
    /// This is not the most efficient strategy but achieves highly packed data.
    public static final int STRATEGY_MIN_OFFSET = VmaAllocationCreateFlags.STRATEGY_MIN_OFFSET;

    /// Allocation strategy that tries to minimize allocation time.
    public static final int STRATEGY_MIN_TIME = VmaAllocationCreateFlags.STRATEGY_MIN_TIME;

    /// Allocation will be created from upper stack in a double stack pool.
    ///
    /// This flag is only allowed for virtual blocks created with {@code VMA_VIRTUAL_BLOCK_CREATE_LINEAR_ALGORITHM_BIT} flag.
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
