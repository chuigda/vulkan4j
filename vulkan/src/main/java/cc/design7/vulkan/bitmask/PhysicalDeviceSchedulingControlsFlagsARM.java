package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceSchedulingControlsFlagsARM.html">VkPhysicalDeviceSchedulingControlsFlagsARM</a>
public final class PhysicalDeviceSchedulingControlsFlagsARM {
    public static final long SHADER_CORE_COUNT = 0x1L;
    
    public static String explain(@enumtype(PhysicalDeviceSchedulingControlsFlagsARM.class) long flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & SHADER_CORE_COUNT) != 0) {
            detectedFlagBits.add("VK_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_SHADER_CORE_COUNT_ARM");
        }
        
        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }
    
    /// Constructing this class is nonsense so the constructor is made private.
    private PhysicalDeviceSchedulingControlsFlagsARM() {}
}
