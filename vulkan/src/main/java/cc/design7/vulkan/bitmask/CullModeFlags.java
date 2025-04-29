package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCullModeFlags.html">VkCullModeFlags</a>
public final class CullModeFlags {
    public static final int BACK = 0x2;
    public static final int FRONT_AND_BACK = 0x3;
    public static final int FRONT = 0x1;
    public static final int NONE = 0x0;
    
    public static String explain(@enumtype(CullModeFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & BACK) != 0) {
            detectedFlagBits.add("VK_CULL_MODE_BACK_BIT");
        }
        if ((flags & FRONT_AND_BACK) != 0) {
            detectedFlagBits.add("VK_CULL_MODE_FRONT_AND_BACK");
        }
        if ((flags & FRONT) != 0) {
            detectedFlagBits.add("VK_CULL_MODE_FRONT_BIT");
        }
        if ((flags & NONE) != 0) {
            detectedFlagBits.add("VK_CULL_MODE_NONE");
        }
        
        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }
    
    /// Constructing this class is nonsense so the constructor is made private.
    private CullModeFlags() {}
}
