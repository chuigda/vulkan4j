package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkAccelerationStructureCreateFlagsKHR {
    public static final int VK_ACCELERATION_STRUCTURE_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR = 1;
    public static final int VK_ACCELERATION_STRUCTURE_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT = 8;
    public static final int VK_ACCELERATION_STRUCTURE_CREATE_MOTION_BIT_NV = 4;

    public static String explain(@enumtype(VkAccelerationStructureCreateFlagsKHR.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_ACCELERATION_STRUCTURE_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCELERATION_STRUCTURE_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR");
        }

        if ((flags & VK_ACCELERATION_STRUCTURE_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCELERATION_STRUCTURE_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT");
        }

        if ((flags & VK_ACCELERATION_STRUCTURE_CREATE_MOTION_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCELERATION_STRUCTURE_CREATE_MOTION_BIT_NV");
        }

        return sb.toString();
    }
}
