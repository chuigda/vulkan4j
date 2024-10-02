package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkPhysicalDeviceSchedulingControlsFlagsARM {
    public static final long VK_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_SHADER_CORE_COUNT_ARM = 1L;

    public static String explain(@enumtype(VkPhysicalDeviceSchedulingControlsFlagsARM.class) long flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_SHADER_CORE_COUNT_ARM) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_SHADER_CORE_COUNT_ARM");
        }

        return sb.toString();
    }
}
