package club.doki7.vma.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

public final class VmaAllocatorCreateFlags {
    public static final int AMD_DEVICE_COHERENT_MEMORY = 0x00000010;
    public static final int BUFFER_DEVICE_ADDRESS = 0x00000020;
    public static final int EXTERNALLY_SYNCHRONIZED = 0x00000001;
    public static final int EXT_MEMORY_BUDGET = 0x00000008;
    public static final int EXT_MEMORY_PRIORITY = 0x00000040;
    public static final int FLAG_BITS_MAX_ENUM = 0x7FFFFFFF;
    public static final int KHR_BIND_MEMORY2 = 0x00000004;
    public static final int KHR_DEDICATED_ALLOCATION = 0x00000002;
    public static final int KHR_MAINTENANCE4 = 0x00000080;
    public static final int KHR_MAINTENANCE5 = 0x00000100;

    public static String explain(@EnumType(VmaAllocatorCreateFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VmaAllocatorCreateFlags() {}
}
