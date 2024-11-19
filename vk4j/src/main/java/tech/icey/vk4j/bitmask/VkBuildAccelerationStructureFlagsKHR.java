package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkBuildAccelerationStructureFlagsKHR {
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_KHR = 1;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_KHR = 2;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_KHR = 4;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_KHR = 8;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_LOW_MEMORY_BIT_KHR = 16;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_MOTION_BIT_NV = 32;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_OPACITY_MICROMAP_UPDATE_EXT = 64;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_DISABLE_OPACITY_MICROMAPS_EXT = 128;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_OPACITY_MICROMAP_DATA_UPDATE_EXT = 256;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_DISPLACEMENT_MICROMAP_UPDATE_NV = 512;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_DATA_ACCESS_KHR = 2048;

    public static String explain(@enumtype(VkBuildAccelerationStructureFlagsKHR.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_KHR");
        }

        if ((flags & VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_KHR");
        }

        if ((flags & VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_KHR");
        }

        if ((flags & VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_KHR");
        }

        if ((flags & VK_BUILD_ACCELERATION_STRUCTURE_LOW_MEMORY_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUILD_ACCELERATION_STRUCTURE_LOW_MEMORY_BIT_KHR");
        }

        if ((flags & VK_BUILD_ACCELERATION_STRUCTURE_MOTION_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUILD_ACCELERATION_STRUCTURE_MOTION_BIT_NV");
        }

        if ((flags & VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_OPACITY_MICROMAP_UPDATE_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_OPACITY_MICROMAP_UPDATE_EXT");
        }

        if ((flags & VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_DISABLE_OPACITY_MICROMAPS_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_DISABLE_OPACITY_MICROMAPS_EXT");
        }

        if ((flags & VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_OPACITY_MICROMAP_DATA_UPDATE_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_OPACITY_MICROMAP_DATA_UPDATE_EXT");
        }

        if ((flags & VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_DISPLACEMENT_MICROMAP_UPDATE_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_DISPLACEMENT_MICROMAP_UPDATE_NV");
        }

        if ((flags & VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_DATA_ACCESS_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_DATA_ACCESS_KHR");
        }

        return sb.toString();
    }
}
