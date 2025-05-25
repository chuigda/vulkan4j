package club.doki7.vma.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

public final class VmaDefragmentationFlags {
    public static final int FLAG_ALGORITHM_BALANCED = 0x2;
    public static final int FLAG_ALGORITHM_EXTENSIVE = 0x8;
    public static final int FLAG_ALGORITHM_FAST = 0x1;
    public static final int FLAG_ALGORITHM_FULL = 0x4;
    public static final int FLAG_BITS_MAX_ENUM = 0x7fffffff;
    public static final int FLAG_ALGORITHM_MASK = FLAG_ALGORITHM_FAST | FLAG_ALGORITHM_BALANCED | FLAG_ALGORITHM_FULL | FLAG_ALGORITHM_EXTENSIVE;

    public static String explain(@EnumType(VmaDefragmentationFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & FLAG_ALGORITHM_BALANCED) != 0) {
            detectedFlagBits.add("VMA_DEFRAGMENTATION_FLAG_ALGORITHM_BALANCED_BIT");
        }
        if ((flags & FLAG_ALGORITHM_EXTENSIVE) != 0) {
            detectedFlagBits.add("VMA_DEFRAGMENTATION_FLAG_ALGORITHM_EXTENSIVE_BIT");
        }
        if ((flags & FLAG_ALGORITHM_FAST) != 0) {
            detectedFlagBits.add("VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FAST_BIT");
        }
        if ((flags & FLAG_ALGORITHM_FULL) != 0) {
            detectedFlagBits.add("VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FULL_BIT");
        }
        if ((flags & FLAG_BITS_MAX_ENUM) != 0) {
            detectedFlagBits.add("VMA_DEFRAGMENTATION_FLAG_BITS_MAX_ENUM");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VmaDefragmentationFlags() {}
}
