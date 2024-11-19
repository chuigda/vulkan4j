package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkDeviceGroupPresentModeFlagsKHR {
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR = 1;
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR = 2;
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR = 4;
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR = 8;

    public static String explain(@enumtype(VkDeviceGroupPresentModeFlagsKHR.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR");
        }

        if ((flags & VK_DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR");
        }

        if ((flags & VK_DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR");
        }

        if ((flags & VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR");
        }

        return sb.toString();
    }
}
