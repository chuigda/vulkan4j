package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceSchedulingControlsFlagsARM.html"><code>VkPhysicalDeviceSchedulingControlsFlagsARM</code></a>
public final class VkPhysicalDeviceSchedulingControlsFlagsARM {
    public static final long SHADER_CORE_COUNT = 0x1L;

    public static String explain(@enumtype(VkPhysicalDeviceSchedulingControlsFlagsARM.class) long flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & SHADER_CORE_COUNT) != 0) {
            detectedFlagBits.add("VK_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_SHADER_CORE_COUNT_ARM");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Long.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkPhysicalDeviceSchedulingControlsFlagsARM() {}
}
