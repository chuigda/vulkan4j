package club.doki7.vma.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

public final class VmaAllocatorCreateFlags {
    public static final int AMD_DEVICE_COHERENT_MEMORY = 0x10;
    public static final int BUFFER_DEVICE_ADDRESS = 0x20;
    public static final int EXTERNALLY_SYNCHRONIZED = 0x1;
    public static final int EXT_MEMORY_BUDGET = 0x8;
    public static final int EXT_MEMORY_PRIORITY = 0x40;
    public static final int FLAG_BITS_MAX_ENUM = 0x7fffffff;
    public static final int KHR_BIND_MEMORY2 = 0x4;
    public static final int KHR_DEDICATED_ALLOCATION = 0x2;
    public static final int KHR_EXTERNAL_MEMORY_WIN32 = 0x200;
    public static final int KHR_MAINTENANCE4 = 0x80;
    public static final int KHR_MAINTENANCE5 = 0x100;

    public static String explain(@EnumType(VmaAllocatorCreateFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & AMD_DEVICE_COHERENT_MEMORY) != 0) {
            detectedFlagBits.add("VMA_ALLOCATOR_CREATE_AMD_DEVICE_COHERENT_MEMORY_BIT");
        }
        if ((flags & BUFFER_DEVICE_ADDRESS) != 0) {
            detectedFlagBits.add("VMA_ALLOCATOR_CREATE_BUFFER_DEVICE_ADDRESS_BIT");
        }
        if ((flags & EXTERNALLY_SYNCHRONIZED) != 0) {
            detectedFlagBits.add("VMA_ALLOCATOR_CREATE_EXTERNALLY_SYNCHRONIZED_BIT");
        }
        if ((flags & EXT_MEMORY_BUDGET) != 0) {
            detectedFlagBits.add("VMA_ALLOCATOR_CREATE_EXT_MEMORY_BUDGET_BIT");
        }
        if ((flags & EXT_MEMORY_PRIORITY) != 0) {
            detectedFlagBits.add("VMA_ALLOCATOR_CREATE_EXT_MEMORY_PRIORITY_BIT");
        }
        if ((flags & FLAG_BITS_MAX_ENUM) != 0) {
            detectedFlagBits.add("VMA_ALLOCATOR_CREATE_FLAG_BITS_MAX_ENUM");
        }
        if ((flags & KHR_BIND_MEMORY2) != 0) {
            detectedFlagBits.add("VMA_ALLOCATOR_CREATE_KHR_BIND_MEMORY2_BIT");
        }
        if ((flags & KHR_DEDICATED_ALLOCATION) != 0) {
            detectedFlagBits.add("VMA_ALLOCATOR_CREATE_KHR_DEDICATED_ALLOCATION_BIT");
        }
        if ((flags & KHR_EXTERNAL_MEMORY_WIN32) != 0) {
            detectedFlagBits.add("VMA_ALLOCATOR_CREATE_KHR_EXTERNAL_MEMORY_WIN32_BIT");
        }
        if ((flags & KHR_MAINTENANCE4) != 0) {
            detectedFlagBits.add("VMA_ALLOCATOR_CREATE_KHR_MAINTENANCE4_BIT");
        }
        if ((flags & KHR_MAINTENANCE5) != 0) {
            detectedFlagBits.add("VMA_ALLOCATOR_CREATE_KHR_MAINTENANCE5_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VmaAllocatorCreateFlags() {}
}
