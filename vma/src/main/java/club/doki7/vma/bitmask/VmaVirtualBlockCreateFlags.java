package club.doki7.vma.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

public final class VmaVirtualBlockCreateFlags {
    public static final int FLAG_BITS_MAX_ENUM = 0x7fffffff;
    public static final int LINEAR_ALGORITHM = 0x1;
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
