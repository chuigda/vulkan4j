package club.doki7.vma.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// Flags to be passed as VmaPoolCreateInfo::flags.
///
public final class VmaPoolCreateFlags {
    /// Bit mask to extract only `ALGORITHM` bits from entire set of flags.
    public static final int FLAG_BITS_MAX_ENUM = 0x7fffffff;

    /// Use this flag if you always allocate only buffers and linear images or only optimal images out of this pool and so Buffer-Image Granularity can be ignored.
    ///
    /// This is an optional optimization flag.
    ///
    /// If you always allocate using vmaCreateBuffer(), vmaCreateImage(),
    /// vmaAllocateMemoryForBuffer(), then you don't need to use it because allocator
    /// knows exact type of your allocations so it can handle Buffer-Image Granularity
    /// in the optimal way.
    ///
    /// If you also allocate using vmaAllocateMemoryForImage() or vmaAllocateMemory(),
    /// exact type of such allocations is not known, so allocator must be conservative
    /// in handling Buffer-Image Granularity, which can lead to suboptimal allocation
    /// (wasted memory). In that case, if you can make sure you always allocate only
    /// buffers and linear images or only optimal images out of this pool, use this flag
    /// to make allocator disregard Buffer-Image Granularity and so make allocations
    /// faster and more optimal.
    public static final int IGNORE_BUFFER_IMAGE_GRANULARITY = 0x2;

    /// Enables alternative, linear allocation algorithm in this pool.
    ///
    /// Specify this flag to enable linear allocation algorithm, which always creates
    /// new allocations after last one and doesn't reuse space from allocations freed in
    /// between. It trades memory consumption for simplified algorithm and data
    /// structure, which has better performance and uses less memory for metadata.
    ///
    /// By using this flag, you can achieve behavior of free-at-once, stack,
    /// ring buffer, and double stack.
    /// For details, see documentation chapter  linear_algorithm.
    public static final int LINEAR_ALGORITHM = 0x4;

    /// Bit mask to extract only `ALGORITHM` bits from entire set of flags.
    public static final int ALGORITHM_MASK = LINEAR_ALGORITHM;

    public static String explain(@EnumType(VmaPoolCreateFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & FLAG_BITS_MAX_ENUM) != 0) {
            detectedFlagBits.add("VMA_POOL_CREATE_FLAG_BITS_MAX_ENUM");
        }
        if ((flags & IGNORE_BUFFER_IMAGE_GRANULARITY) != 0) {
            detectedFlagBits.add("VMA_POOL_CREATE_IGNORE_BUFFER_IMAGE_GRANULARITY_BIT");
        }
        if ((flags & LINEAR_ALGORITHM) != 0) {
            detectedFlagBits.add("VMA_POOL_CREATE_LINEAR_ALGORITHM_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VmaPoolCreateFlags() {}
}
