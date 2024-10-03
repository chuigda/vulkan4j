package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkOpticalFlowSessionCreateFlagsNV {
    public static final int VK_OPTICAL_FLOW_SESSION_CREATE_ENABLE_HINT_BIT_NV = 1;
    public static final int VK_OPTICAL_FLOW_SESSION_CREATE_ENABLE_COST_BIT_NV = 2;
    public static final int VK_OPTICAL_FLOW_SESSION_CREATE_ENABLE_GLOBAL_FLOW_BIT_NV = 4;
    public static final int VK_OPTICAL_FLOW_SESSION_CREATE_ALLOW_REGIONS_BIT_NV = 8;
    public static final int VK_OPTICAL_FLOW_SESSION_CREATE_BOTH_DIRECTIONS_BIT_NV = 16;

    public static String explain(@enumtype(VkOpticalFlowSessionCreateFlagsNV.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_OPTICAL_FLOW_SESSION_CREATE_ENABLE_HINT_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_OPTICAL_FLOW_SESSION_CREATE_ENABLE_HINT_BIT_NV");
        }

        if ((flags & VK_OPTICAL_FLOW_SESSION_CREATE_ENABLE_COST_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_OPTICAL_FLOW_SESSION_CREATE_ENABLE_COST_BIT_NV");
        }

        if ((flags & VK_OPTICAL_FLOW_SESSION_CREATE_ENABLE_GLOBAL_FLOW_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_OPTICAL_FLOW_SESSION_CREATE_ENABLE_GLOBAL_FLOW_BIT_NV");
        }

        if ((flags & VK_OPTICAL_FLOW_SESSION_CREATE_ALLOW_REGIONS_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_OPTICAL_FLOW_SESSION_CREATE_ALLOW_REGIONS_BIT_NV");
        }

        if ((flags & VK_OPTICAL_FLOW_SESSION_CREATE_BOTH_DIRECTIONS_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_OPTICAL_FLOW_SESSION_CREATE_BOTH_DIRECTIONS_BIT_NV");
        }

        return sb.toString();
    }
}
