package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkOpticalFlowGridSizeFlagsNV {
    public static final int VK_OPTICAL_FLOW_GRID_SIZE_UNKNOWN_NV = 0;
    public static final int VK_OPTICAL_FLOW_GRID_SIZE_1X1_BIT_NV = 1;
    public static final int VK_OPTICAL_FLOW_GRID_SIZE_2X2_BIT_NV = 2;
    public static final int VK_OPTICAL_FLOW_GRID_SIZE_4X4_BIT_NV = 4;
    public static final int VK_OPTICAL_FLOW_GRID_SIZE_8X8_BIT_NV = 8;

    public static String explain(@enumtype(VkOpticalFlowGridSizeFlagsNV.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_OPTICAL_FLOW_GRID_SIZE_UNKNOWN_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_OPTICAL_FLOW_GRID_SIZE_UNKNOWN_NV");
        }

        if ((flags & VK_OPTICAL_FLOW_GRID_SIZE_1X1_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_OPTICAL_FLOW_GRID_SIZE_1X1_BIT_NV");
        }

        if ((flags & VK_OPTICAL_FLOW_GRID_SIZE_2X2_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_OPTICAL_FLOW_GRID_SIZE_2X2_BIT_NV");
        }

        if ((flags & VK_OPTICAL_FLOW_GRID_SIZE_4X4_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_OPTICAL_FLOW_GRID_SIZE_4X4_BIT_NV");
        }

        if ((flags & VK_OPTICAL_FLOW_GRID_SIZE_8X8_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_OPTICAL_FLOW_GRID_SIZE_8X8_BIT_NV");
        }

        return sb.toString();
    }
}
