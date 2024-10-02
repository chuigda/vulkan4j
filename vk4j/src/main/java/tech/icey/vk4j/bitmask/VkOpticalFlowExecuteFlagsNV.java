package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkOpticalFlowExecuteFlagsNV {
    public static final int VK_OPTICAL_FLOW_EXECUTE_DISABLE_TEMPORAL_HINTS_BIT_NV = 1;

    public static String explain(@enumtype(VkOpticalFlowExecuteFlagsNV.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_OPTICAL_FLOW_EXECUTE_DISABLE_TEMPORAL_HINTS_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_OPTICAL_FLOW_EXECUTE_DISABLE_TEMPORAL_HINTS_BIT_NV");
        }

        return sb.toString();
    }
}
