package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkOpticalFlowUsageFlagsNV {
    public static final int VK_OPTICAL_FLOW_USAGE_UNKNOWN_NV = 0;
    public static final int VK_OPTICAL_FLOW_USAGE_INPUT_BIT_NV = 1;
    public static final int VK_OPTICAL_FLOW_USAGE_OUTPUT_BIT_NV = 2;
    public static final int VK_OPTICAL_FLOW_USAGE_HINT_BIT_NV = 4;
    public static final int VK_OPTICAL_FLOW_USAGE_COST_BIT_NV = 8;
    public static final int VK_OPTICAL_FLOW_USAGE_GLOBAL_FLOW_BIT_NV = 16;

    public static String explain(@enumtype(VkOpticalFlowUsageFlagsNV.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_OPTICAL_FLOW_USAGE_UNKNOWN_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_OPTICAL_FLOW_USAGE_UNKNOWN_NV");
        }

        if ((flags & VK_OPTICAL_FLOW_USAGE_INPUT_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_OPTICAL_FLOW_USAGE_INPUT_BIT_NV");
        }

        if ((flags & VK_OPTICAL_FLOW_USAGE_OUTPUT_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_OPTICAL_FLOW_USAGE_OUTPUT_BIT_NV");
        }

        if ((flags & VK_OPTICAL_FLOW_USAGE_HINT_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_OPTICAL_FLOW_USAGE_HINT_BIT_NV");
        }

        if ((flags & VK_OPTICAL_FLOW_USAGE_COST_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_OPTICAL_FLOW_USAGE_COST_BIT_NV");
        }

        if ((flags & VK_OPTICAL_FLOW_USAGE_GLOBAL_FLOW_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_OPTICAL_FLOW_USAGE_GLOBAL_FLOW_BIT_NV");
        }

        return sb.toString();
    }
}
