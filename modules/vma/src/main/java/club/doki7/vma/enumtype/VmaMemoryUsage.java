package club.doki7.vma.enumtype;

import club.doki7.ffm.annotation.*;
import org.intellij.lang.annotations.MagicConstant;

/// Intended usage of the allocated memory.
///
public final class VmaMemoryUsage {
    /// No intended memory usage specified.
    /// Use other members of VmaAllocationCreateInfo to specify your requirements.
    public static final int UNKNOWN = 0x0;

    /// @deprecated Obsolete, preserved for backward compatibility.
    /// Prefers `VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT`.
    public static final int GPU_ONLY = 0x1;

    /// @deprecated Obsolete, preserved for backward compatibility.
    /// Guarantees `VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT` and `VK_MEMORY_PROPERTY_HOST_COHERENT_BIT`.
    public static final int CPU_ONLY = 0x2;

    /// @deprecated Obsolete, preserved for backward compatibility.
    /// Guarantees `VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT`, prefers `VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT`.
    public static final int CPU_TO_GPU = 0x3;

    /// @deprecated Obsolete, preserved for backward compatibility.
    /// Guarantees `VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT`, prefers `VK_MEMORY_PROPERTY_HOST_CACHED_BIT`.
    public static final int GPU_TO_CPU = 0x4;

    /// @deprecated Obsolete, preserved for backward compatibility.
    /// Prefers not `VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT`.
    public static final int CPU_COPY = 0x5;

    /// Lazily allocated GPU memory having `VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT`.
    /// Exists mostly on mobile platforms. Using it on desktop PC or other GPUs with no such memory type present will fail the allocation.
    ///
    /// Usage: Memory for transient attachment images (color attachments, depth attachments etc.), created with `VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT`.
    ///
    /// Allocations with this usage are always created as dedicated - it implies {@code VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT}.
    public static final int GPU_LAZILY_ALLOCATED = 0x6;

    /// Selects best memory type automatically.
    /// This flag is recommended for most common use cases.
    ///
    /// When using this flag, if you want to map the allocation (using vmaMapMemory() or {@code VMA_ALLOCATION_CREATE_MAPPED_BIT}),
    /// you must pass one of the flags: {@code VMA_ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT} or {@code VMA_ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT}
    /// in VmaAllocationCreateInfo::flags.
    ///
    /// It can be used only with functions that let the library know `VkBufferCreateInfo` or `VkImageCreateInfo`, e.g.
    /// vmaCreateBuffer(), vmaCreateImage(), vmaFindMemoryTypeIndexForBufferInfo(), vmaFindMemoryTypeIndexForImageInfo()
    /// and not with generic memory allocation functions.
    public static final int AUTO = 0x7;

    /// Selects best memory type automatically with preference for GPU (device) memory.
    ///
    /// When using this flag, if you want to map the allocation (using vmaMapMemory() or {@code VMA_ALLOCATION_CREATE_MAPPED_BIT}),
    /// you must pass one of the flags: {@code VMA_ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT} or {@code VMA_ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT}
    /// in VmaAllocationCreateInfo::flags.
    ///
    /// It can be used only with functions that let the library know `VkBufferCreateInfo` or `VkImageCreateInfo`, e.g.
    /// vmaCreateBuffer(), vmaCreateImage(), vmaFindMemoryTypeIndexForBufferInfo(), vmaFindMemoryTypeIndexForImageInfo()
    /// and not with generic memory allocation functions.
    public static final int AUTO_PREFER_DEVICE = 0x8;

    /// Selects best memory type automatically with preference for CPU (host) memory.
    ///
    /// When using this flag, if you want to map the allocation (using vmaMapMemory() or {@code VMA_ALLOCATION_CREATE_MAPPED_BIT}),
    /// you must pass one of the flags: {@code VMA_ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT} or {@code VMA_ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT}
    /// in VmaAllocationCreateInfo::flags.
    ///
    /// It can be used only with functions that let the library know `VkBufferCreateInfo` or `VkImageCreateInfo`, e.g.
    /// vmaCreateBuffer(), vmaCreateImage(), vmaFindMemoryTypeIndexForBufferInfo(), vmaFindMemoryTypeIndexForImageInfo()
    /// and not with generic memory allocation functions.
    public static final int AUTO_PREFER_HOST = 0x9;
    public static final int MAX_ENUM = 0x7fffffff;

    public static String explain(@MagicConstant(valuesFromClass = VmaMemoryUsage.class) int value) {
        return switch (value) {
            case VmaMemoryUsage.AUTO -> "VMA_MEMORY_USAGE_AUTO";
            case VmaMemoryUsage.AUTO_PREFER_DEVICE -> "VMA_MEMORY_USAGE_AUTO_PREFER_DEVICE";
            case VmaMemoryUsage.AUTO_PREFER_HOST -> "VMA_MEMORY_USAGE_AUTO_PREFER_HOST";
            case VmaMemoryUsage.CPU_COPY -> "VMA_MEMORY_USAGE_CPU_COPY";
            case VmaMemoryUsage.CPU_ONLY -> "VMA_MEMORY_USAGE_CPU_ONLY";
            case VmaMemoryUsage.CPU_TO_GPU -> "VMA_MEMORY_USAGE_CPU_TO_GPU";
            case VmaMemoryUsage.GPU_LAZILY_ALLOCATED -> "VMA_MEMORY_USAGE_GPU_LAZILY_ALLOCATED";
            case VmaMemoryUsage.GPU_ONLY -> "VMA_MEMORY_USAGE_GPU_ONLY";
            case VmaMemoryUsage.GPU_TO_CPU -> "VMA_MEMORY_USAGE_GPU_TO_CPU";
            case VmaMemoryUsage.MAX_ENUM -> "VMA_MEMORY_USAGE_MAX_ENUM";
            case VmaMemoryUsage.UNKNOWN -> "VMA_MEMORY_USAGE_UNKNOWN";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VmaMemoryUsage() {}
}
