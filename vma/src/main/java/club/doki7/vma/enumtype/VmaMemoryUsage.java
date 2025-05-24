package club.doki7.vma.enumtype;

import club.doki7.ffm.annotation.*;

public final class VmaMemoryUsage {
    public static final int UNKNOWN = 0;
    public static final int GPU_ONLY = 1;
    public static final int CPU_ONLY = 2;
    public static final int CPU_TO_GPU = 3;
    public static final int GPU_TO_CPU = 4;
    public static final int CPU_COPY = 5;
    public static final int GPU_LAZILY_ALLOCATED = 6;
    public static final int AUTO = 7;
    public static final int AUTO_PREFER_DEVICE = 8;
    public static final int AUTO_PREFER_HOST = 9;
    public static final int MAX_ENUM = 0x7FFFFFFF;

    public static String explain(@EnumType(VmaMemoryUsage.class) int value) {
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
