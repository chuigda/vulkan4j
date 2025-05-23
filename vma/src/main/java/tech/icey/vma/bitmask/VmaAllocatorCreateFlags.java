package tech.icey.vma.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VmaAllocatorCreateFlags {
    public static final int VMA_ALLOCATOR_CREATE_EXTERNALLY_SYNCHRONIZED_BIT = 0x00000001;
    public static final int VMA_ALLOCATOR_CREATE_KHR_DEDICATED_ALLOCATION_BIT = 0x00000002;
    public static final int VMA_ALLOCATOR_CREATE_KHR_BIND_MEMORY2_BIT = 0x00000004;
    public static final int VMA_ALLOCATOR_CREATE_EXT_MEMORY_BUDGET_BIT = 0x00000008;
    public static final int VMA_ALLOCATOR_CREATE_AMD_DEVICE_COHERENT_MEMORY_BIT = 0x00000010;
    public static final int VMA_ALLOCATOR_CREATE_BUFFER_DEVICE_ADDRESS_BIT = 0x00000020;
    public static final int VMA_ALLOCATOR_CREATE_EXT_MEMORY_PRIORITY_BIT = 0x00000040;
    public static final int VMA_ALLOCATOR_CREATE_KHR_MAINTENANCE4_BIT = 0x00000080;
    public static final int VMA_ALLOCATOR_CREATE_KHR_MAINTENANCE5_BIT = 0x00000100;
    public static final int VMA_ALLOCATOR_CREATE_FLAG_BITS_MAX_ENUM = 0x7FFFFFFF;

    public static String explain(@enumtype(VmaAllocatorCreateFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();
        if ((flags & VMA_ALLOCATOR_CREATE_EXTERNALLY_SYNCHRONIZED_BIT) != 0) {
            sb.append("VMA_ALLOCATOR_CREATE_EXTERNALLY_SYNCHRONIZED_BIT ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        if ((flags & VMA_ALLOCATOR_CREATE_KHR_DEDICATED_ALLOCATION_BIT) != 0) {
            sb.append("VMA_ALLOCATOR_CREATE_KHR_DEDICATED_ALLOCATION_BIT ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        if ((flags & VMA_ALLOCATOR_CREATE_KHR_BIND_MEMORY2_BIT) != 0) {
            sb.append("VMA_ALLOCATOR_CREATE_KHR_BIND_MEMORY2_BIT ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        if ((flags & VMA_ALLOCATOR_CREATE_EXT_MEMORY_BUDGET_BIT) != 0) {
            sb.append("VMA_ALLOCATOR_CREATE_EXT_MEMORY_BUDGET_BIT ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        if ((flags & VMA_ALLOCATOR_CREATE_AMD_DEVICE_COHERENT_MEMORY_BIT) != 0) {
            sb.append("VMA_ALLOCATOR_CREATE_AMD_DEVICE_COHERENT_MEMORY_BIT ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        if ((flags & VMA_ALLOCATOR_CREATE_BUFFER_DEVICE_ADDRESS_BIT) != 0) {
            sb.append("VMA_ALLOCATOR_CREATE_BUFFER_DEVICE_ADDRESS_BIT ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        if ((flags & VMA_ALLOCATOR_CREATE_EXT_MEMORY_PRIORITY_BIT) != 0) {
            sb.append("VMA_ALLOCATOR_CREATE_EXT_MEMORY_PRIORITY_BIT ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        if ((flags & VMA_ALLOCATOR_CREATE_KHR_MAINTENANCE4_BIT) != 0) {
            sb.append("VMA_ALLOCATOR_CREATE_KHR_MAINTENANCE4_BIT ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        if ((flags & VMA_ALLOCATOR_CREATE_KHR_MAINTENANCE5_BIT) != 0) {
            sb.append("VMA_ALLOCATOR_CREATE_KHR_MAINTENANCE5_BIT ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        if ((flags & VMA_ALLOCATOR_CREATE_FLAG_BITS_MAX_ENUM) != 0) {
            sb.append("VMA_ALLOCATOR_CREATE_FLAG_BITS_MAX_ENUM ");
            if (!sb.isEmpty()) {
                sb.append("|");
            }
        }
        return sb.toString();
    }
}
