package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMicromapCreateFlagsEXT.html">VkMicromapCreateFlagsEXT</a>
public final class MicromapCreateFlagsEXT {
    public static final int DEVICE_ADDRESS_CAPTURE_REPLAY = 0x1;
    
    public static String explain(@enumtype(MicromapCreateFlagsEXT.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & DEVICE_ADDRESS_CAPTURE_REPLAY) != 0) {
            detectedFlagBits.add("VK_MICROMAP_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_EXT");
        }
        
        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }
    
    /// Constructing this class is nonsense so the constructor is made private.
    private MicromapCreateFlagsEXT() {}
}
