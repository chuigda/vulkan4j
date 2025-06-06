package club.doki7.vma.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// Flags to be passed as VmaVirtualBlockCreateInfo::flags.
///
public final class VmaVirtualBlockCreateFlags {
    public static final int FLAG_BITS_MAX_ENUM = 0x7fffffff;

    /// Enables alternative, linear allocation algorithm in this virtual block.
    ///
    /// Specify this flag to enable linear allocation algorithm, which always creates
    /// new allocations after last one and doesn't reuse space from allocations freed in
    /// between. It trades memory consumption for simplified algorithm and data
    /// structure, which has better performance and uses less memory for metadata.
    ///
    /// By using this flag, you can achieve behavior of free-at-once, stack,
    /// ring buffer, and double stack.
    /// For details, see documentation chapter  linear_algorithm.
    public static final int LINEAR_ALGORITHM = 0x1;

    /// Bit mask to extract only `ALGORITHM` bits from entire set of flags.
    public static final int ALGORITHM_MASK = LINEAR_ALGORITHM;

    public static String explain(@EnumType(VmaVirtualBlockCreateFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & FLAG_BITS_MAX_ENUM) != 0) {
            detectedFlagBits.add("VMA_VIRTUAL_BLOCK_CREATE_FLAG_BITS_MAX_ENUM");
        }
        if ((flags & LINEAR_ALGORITHM) != 0) {
            detectedFlagBits.add("VMA_VIRTUAL_BLOCK_CREATE_LINEAR_ALGORITHM_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VmaVirtualBlockCreateFlags() {}
}
