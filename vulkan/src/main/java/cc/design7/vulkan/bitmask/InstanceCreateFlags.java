package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkInstanceCreateFlags.html">VkInstanceCreateFlags</a>
public final class InstanceCreateFlags {
    public static final int ENUMERATE_PORTABILITY_KHR = 0x1;
    
    public static String explain(@enumtype(InstanceCreateFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & ENUMERATE_PORTABILITY_KHR) != 0) {
            detectedFlagBits.add("VK_INSTANCE_CREATE_ENUMERATE_PORTABILITY_BIT_KHR");
        }
        
        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }
    
    /// Constructing this class is nonsense so the constructor is made private.
    private InstanceCreateFlags() {}
}
