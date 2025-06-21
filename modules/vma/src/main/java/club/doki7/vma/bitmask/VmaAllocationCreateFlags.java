package club.doki7.vma.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// Flags to be passed as VmaAllocationCreateInfo::flags.
///
public final class VmaAllocationCreateFlags {
    /// Set this flag if the allocated memory will have aliasing resources.
    ///
    /// Usage of this flag prevents supplying `VkMemoryDedicatedAllocateInfoKHR` when {@code VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT} is specified.
    /// Otherwise created dedicated memory will not be suitable for aliasing resources, resulting in Vulkan Validation Layer errors.
    public static final int CAN_ALIAS = 0x200;

    /// Set this flag if the allocation should have its own memory block.
    ///
    /// Use it for special, big resources, like fullscreen images used as attachments.
    ///
    /// If you use this flag while creating a buffer or an image, `VkMemoryDedicatedAllocateInfo`
    /// structure is applied if possible.
    public static final int DEDICATED_MEMORY = 0x1;

    /// Create both buffer/image and allocation, but don't bind them together.
    /// It is useful when you want to bind yourself to do some more advanced binding, e.g. using some extensions.
    /// The flag is meaningful only with functions that bind by default: vmaCreateBuffer(), vmaCreateImage().
    /// Otherwise it is ignored.
    ///
    /// If you want to make sure the new buffer/image is not tied to the new memory allocation
    /// through `VkMemoryDedicatedAllocateInfoKHR` structure in case the allocation ends up in its own memory block,
    /// use also flag {@code VMA_ALLOCATION_CREATE_CAN_ALIAS_BIT}.
    public static final int DONT_BIND = 0x80;
    public static final int FLAG_BITS_MAX_ENUM = 0x7fffffff;

    /// Together with {@code VMA_ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT} or {@code VMA_ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT},
    /// it says that despite request for host access, a not-`HOST_VISIBLE` memory type can be selected
    /// if it may improve performance.
    ///
    /// By using this flag, you declare that you will check if the allocation ended up in a `HOST_VISIBLE` memory type
    /// (e.g. using vmaGetAllocationMemoryProperties()) and if not, you will create some "staging" buffer and
    /// issue an explicit transfer to write/read your data.
    /// To prepare for this possibility, don't forget to add appropriate flags like
    /// `VK_BUFFER_USAGE_TRANSFER_DST_BIT`, `VK_BUFFER_USAGE_TRANSFER_SRC_BIT` to the parameters of created buffer or image.
    public static final int HOST_ACCESS_ALLOW_TRANSFER_INSTEAD = 0x1000;

    /// Requests possibility to map the allocation (using vmaMapMemory() or {@code VMA_ALLOCATION_CREATE_MAPPED_BIT}).
    ///
    /// - If you use {@code VMA_MEMORY_USAGE_AUTO} or other `VMA_MEMORY_USAGE_AUTO*` value,
    /// you must use this flag to be able to map the allocation. Otherwise, mapping is incorrect.
    /// - If you use other value of {@code VmaMemoryUsage}, this flag is ignored and mapping is always possible in memory types that are `HOST_VISIBLE`.
    /// This includes allocations created in  custom_memory_pools.
    ///
    /// Declares that mapped memory can be read, written, and accessed in random order,
    /// so a `HOST_CACHED` memory type is preferred.
    public static final int HOST_ACCESS_RANDOM = 0x800;

    /// Requests possibility to map the allocation (using vmaMapMemory() or {@code VMA_ALLOCATION_CREATE_MAPPED_BIT}).
    ///
    /// - If you use {@code VMA_MEMORY_USAGE_AUTO} or other `VMA_MEMORY_USAGE_AUTO*` value,
    /// you must use this flag to be able to map the allocation. Otherwise, mapping is incorrect.
    /// - If you use other value of {@code VmaMemoryUsage}, this flag is ignored and mapping is always possible in memory types that are `HOST_VISIBLE`.
    /// This includes allocations created in  custom_memory_pools.
    ///
    /// Declares that mapped memory will only be written sequentially, e.g. using `memcpy()` or a loop writing number-by-number,
    /// never read or accessed randomly, so a memory type can be selected that is uncached and write-combined.
    ///
    /// <b>Warning: </b> Violating this declaration may work correctly, but will likely be very slow.
    /// Watch out for implicit reads introduced by doing e.g. `pMappedData[i] += x;`
    /// Better prepare your data in a local variable and `memcpy()` it to the mapped pointer all at once.
    public static final int HOST_ACCESS_SEQUENTIAL_WRITE = 0x400;

    /// Set this flag to use a memory that will be persistently mapped and retrieve pointer to it.
    ///
    /// Pointer to mapped memory will be returned through VmaAllocationInfo::pMappedData.
    ///
    /// It is valid to use this flag for allocation made from memory type that is not
    /// `HOST_VISIBLE`. This flag is then ignored and memory is not mapped. This is
    /// useful if you need an allocation that is efficient to use on GPU
    /// (`DEVICE_LOCAL`) and still want to map it directly if possible on platforms that
    /// support it (e.g. Intel GPU).
    public static final int MAPPED = 0x4;

    /// Set this flag to only try to allocate from existing `VkDeviceMemory` blocks and never create new such block.
    ///
    /// If new allocation cannot be placed in any of the existing blocks, allocation
    /// fails with `VK_ERROR_OUT_OF_DEVICE_MEMORY` error.
    ///
    /// You should not use {@code VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT} and
    /// {@code VMA_ALLOCATION_CREATE_NEVER_ALLOCATE_BIT} at the same time. It makes no sense.
    public static final int NEVER_ALLOCATE = 0x2;

    /// Allocation strategy that chooses smallest possible free range for the allocation
    /// to minimize memory usage and fragmentation, possibly at the expense of allocation time.
    public static final int STRATEGY_MIN_MEMORY = 0x10000;

    /// Allocation strategy that chooses always the lowest offset in available space.
    /// This is not the most efficient strategy but achieves highly packed data.
    /// Used internally by defragmentation, not recommended in typical usage.
    public static final int STRATEGY_MIN_OFFSET = 0x40000;

    /// Allocation strategy that chooses first suitable free range for the allocation -
    /// not necessarily in terms of the smallest offset but the one that is easiest and fastest to find
    /// to minimize allocation time, possibly at the expense of allocation quality.
    public static final int STRATEGY_MIN_TIME = 0x20000;

    /// Allocation will be created from upper stack in a double stack pool.
    ///
    /// This flag is only allowed for custom pools created with {@code VMA_POOL_CREATE_LINEAR_ALGORITHM_BIT} flag.
    public static final int UPPER_ADDRESS = 0x40;

    /// @deprecated Preserved for backward compatibility. Consider using vmaSetAllocationName() instead.
    ///
    /// Set this flag to treat VmaAllocationCreateInfo::pUserData as pointer to a
    /// null-terminated string. Instead of copying pointer value, a local copy of the
    /// string is made and stored in allocation's `pName`. The string is automatically
    /// freed together with the allocation. It is also used in vmaBuildStatsString().
    public static final int USER_DATA_COPY_STRING = 0x20;

    /// Create allocation only if additional device memory required for it, if any, won't exceed
    /// memory budget. Otherwise return `VK_ERROR_OUT_OF_DEVICE_MEMORY`.
    public static final int WITHIN_BUDGET = 0x100;

    /// Alias to {@code VMA_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT}.
    public static final int STRATEGY_BEST_FIT = STRATEGY_MIN_MEMORY;

    /// Alias to {@code VMA_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT}.
    public static final int STRATEGY_FIRST_FIT = STRATEGY_MIN_TIME;

    /// A bit mask to extract only `STRATEGY` bits from entire set of flags.
    public static final int STRATEGY_MASK = STRATEGY_MIN_MEMORY | STRATEGY_MIN_TIME | STRATEGY_MIN_OFFSET;

    public static String explain(@Bitmask(VmaAllocationCreateFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & CAN_ALIAS) != 0) {
            detectedFlagBits.add("VMA_ALLOCATION_CREATE_CAN_ALIAS_BIT");
        }
        if ((flags & DEDICATED_MEMORY) != 0) {
            detectedFlagBits.add("VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT");
        }
        if ((flags & DONT_BIND) != 0) {
            detectedFlagBits.add("VMA_ALLOCATION_CREATE_DONT_BIND_BIT");
        }
        if ((flags & FLAG_BITS_MAX_ENUM) != 0) {
            detectedFlagBits.add("VMA_ALLOCATION_CREATE_FLAG_BITS_MAX_ENUM");
        }
        if ((flags & HOST_ACCESS_ALLOW_TRANSFER_INSTEAD) != 0) {
            detectedFlagBits.add("VMA_ALLOCATION_CREATE_HOST_ACCESS_ALLOW_TRANSFER_INSTEAD_BIT");
        }
        if ((flags & HOST_ACCESS_RANDOM) != 0) {
            detectedFlagBits.add("VMA_ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT");
        }
        if ((flags & HOST_ACCESS_SEQUENTIAL_WRITE) != 0) {
            detectedFlagBits.add("VMA_ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT");
        }
        if ((flags & MAPPED) != 0) {
            detectedFlagBits.add("VMA_ALLOCATION_CREATE_MAPPED_BIT");
        }
        if ((flags & NEVER_ALLOCATE) != 0) {
            detectedFlagBits.add("VMA_ALLOCATION_CREATE_NEVER_ALLOCATE_BIT");
        }
        if ((flags & STRATEGY_MIN_MEMORY) != 0) {
            detectedFlagBits.add("VMA_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT");
        }
        if ((flags & STRATEGY_MIN_OFFSET) != 0) {
            detectedFlagBits.add("VMA_ALLOCATION_CREATE_STRATEGY_MIN_OFFSET_BIT");
        }
        if ((flags & STRATEGY_MIN_TIME) != 0) {
            detectedFlagBits.add("VMA_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT");
        }
        if ((flags & UPPER_ADDRESS) != 0) {
            detectedFlagBits.add("VMA_ALLOCATION_CREATE_UPPER_ADDRESS_BIT");
        }
        if ((flags & USER_DATA_COPY_STRING) != 0) {
            detectedFlagBits.add("VMA_ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT");
        }
        if ((flags & WITHIN_BUDGET) != 0) {
            detectedFlagBits.add("VMA_ALLOCATION_CREATE_WITHIN_BUDGET_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VmaAllocationCreateFlags() {}
}
