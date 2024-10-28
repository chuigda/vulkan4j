package tech.icey.vma.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VmaMemoryUsage {
    public static final int VMA_MEMORY_USAGE_UNKNOWN = 0;
    public static final int VMA_MEMORY_USAGE_GPU_ONLY = 1;
    public static final int VMA_MEMORY_USAGE_CPU_ONLY = 2;
    public static final int VMA_MEMORY_USAGE_CPU_TO_GPU = 3;
    public static final int VMA_MEMORY_USAGE_GPU_TO_CPU = 4;
    public static final int VMA_MEMORY_USAGE_CPU_COPY = 5;
    public static final int VMA_MEMORY_USAGE_GPU_LAZILY_ALLOCATED = 6;
    public static final int VMA_MEMORY_USAGE_AUTO = 7;
    public static final int VMA_MEMORY_USAGE_AUTO_PREFER_DEVICE = 8;
    public static final int VMA_MEMORY_USAGE_AUTO_PREFER_HOST = 9;
    public static final int VMA_MEMORY_USAGE_MAX_ENUM = 0x7FFFFFFF;

    public static String explain(@enumtype(VmaMemoryUsage.class) int value) {
        return switch (value) {
            case VmaMemoryUsage.VMA_MEMORY_USAGE_UNKNOWN -> "VMA_MEMORY_USAGE_UNKNOWN";
            case VmaMemoryUsage.VMA_MEMORY_USAGE_GPU_ONLY -> "VMA_MEMORY_USAGE_GPU_ONLY";
            case VmaMemoryUsage.VMA_MEMORY_USAGE_CPU_ONLY -> "VMA_MEMORY_USAGE_CPU_ONLY";
            case VmaMemoryUsage.VMA_MEMORY_USAGE_CPU_TO_GPU -> "VMA_MEMORY_USAGE_CPU_TO_GPU";
            case VmaMemoryUsage.VMA_MEMORY_USAGE_GPU_TO_CPU -> "VMA_MEMORY_USAGE_GPU_TO_CPU";
            case VmaMemoryUsage.VMA_MEMORY_USAGE_CPU_COPY -> "VMA_MEMORY_USAGE_CPU_COPY";
            case VmaMemoryUsage.VMA_MEMORY_USAGE_GPU_LAZILY_ALLOCATED -> "VMA_MEMORY_USAGE_GPU_LAZILY_ALLOCATED";
            case VmaMemoryUsage.VMA_MEMORY_USAGE_AUTO -> "VMA_MEMORY_USAGE_AUTO";
            case VmaMemoryUsage.VMA_MEMORY_USAGE_AUTO_PREFER_DEVICE -> "VMA_MEMORY_USAGE_AUTO_PREFER_DEVICE";
            case VmaMemoryUsage.VMA_MEMORY_USAGE_AUTO_PREFER_HOST -> "VMA_MEMORY_USAGE_AUTO_PREFER_HOST";
            case VmaMemoryUsage.VMA_MEMORY_USAGE_MAX_ENUM -> "VMA_MEMORY_USAGE_MAX_ENUM";
            default -> "Unknown VmaMemoryUsage: " + value;
        };
    }
}
