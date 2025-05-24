package club.doki7.vma.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

public final class VmaPoolCreateFlags {
    public static final int ALGORITHM_MASK = VMA_POOL_CREATE_LINEAR_ALGORITHM_BIT;
    public static final int FLAG_BITS_MAX_ENUM = 0x7FFFFFFF;
    public static final int IGNORE_BUFFER_IMAGE_GRANULARITY = 0x00000002;
    public static final int LINEAR_ALGORITHM = 0x00000004;

    public static String explain(@EnumType(VmaPoolCreateFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VmaPoolCreateFlags() {}
}
