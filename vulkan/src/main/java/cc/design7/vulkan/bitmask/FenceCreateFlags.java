package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkFenceCreateFlags.html">VkFenceCreateFlags</a>
public final class FenceCreateFlags {
    public static final int SIGNALED = 0x1;
    
    public static String explain(@enumtype(FenceCreateFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & SIGNALED) != 0) {
            detectedFlagBits.add("VK_FENCE_CREATE_SIGNALED_BIT");
        }
        
        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }
    
    /// Constructing this class is nonsense so the constructor is made private.
    private FenceCreateFlags() {}
}
