package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectStateFlagsNV.html">VkIndirectStateFlagsNV</a>
public final class IndirectStateFlagsNV {
    public static final int FLAG_FRONTFACE = 0x1;
    
    public static String explain(@enumtype(IndirectStateFlagsNV.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & FLAG_FRONTFACE) != 0) {
            detectedFlagBits.add("VK_INDIRECT_STATE_FLAG_FRONTFACE_BIT_NV");
        }
        
        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }
    
    /// Constructing this class is nonsense so the constructor is made private.
    private IndirectStateFlagsNV() {}
}
