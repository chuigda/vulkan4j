package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureCreateFlagsKHR.html">VkAccelerationStructureCreateFlagsKHR</a>
public final class VkAccelerationStructureCreateFlagsKHR {
    public static final int ACCELERATION_STRUCTURE_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_EXT = 0x8;
    public static final int ACCELERATION_STRUCTURE_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY = 0x1;
    public static final int ACCELERATION_STRUCTURE_CREATE_MOTION_NV = 0x4;

    public static String explain(@enumtype(VkAccelerationStructureCreateFlagsKHR.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & ACCELERATION_STRUCTURE_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_EXT) != 0) {
            detectedFlagBits.add("VK_ACCELERATION_STRUCTURE_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT");
        }
        if ((flags & ACCELERATION_STRUCTURE_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY) != 0) {
            detectedFlagBits.add("VK_ACCELERATION_STRUCTURE_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR");
        }
        if ((flags & ACCELERATION_STRUCTURE_CREATE_MOTION_NV) != 0) {
            detectedFlagBits.add("VK_ACCELERATION_STRUCTURE_CREATE_MOTION_BIT_NV");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkAccelerationStructureCreateFlagsKHR() {}
}
