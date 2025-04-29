package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkResolveModeFlags.html">VkResolveModeFlags</a>
public final class ResolveModeFlags {
    public static final int AVERAGE = 0x2;
    public static final int EXTERNAL_FORMAT_DOWNSAMPLE_ANDROID = 0x10;
    public static final int MAX = 0x8;
    public static final int MIN = 0x4;
    public static final int NONE = 0x0;
    public static final int SAMPLE_ZERO = 0x1;
    
    public static String explain(@enumtype(ResolveModeFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & AVERAGE) != 0) {
            detectedFlagBits.add("VK_RESOLVE_MODE_AVERAGE_BIT");
        }
        if ((flags & EXTERNAL_FORMAT_DOWNSAMPLE_ANDROID) != 0) {
            detectedFlagBits.add("VK_RESOLVE_MODE_EXTERNAL_FORMAT_DOWNSAMPLE_ANDROID");
        }
        if ((flags & MAX) != 0) {
            detectedFlagBits.add("VK_RESOLVE_MODE_MAX_BIT");
        }
        if ((flags & MIN) != 0) {
            detectedFlagBits.add("VK_RESOLVE_MODE_MIN_BIT");
        }
        if ((flags & NONE) != 0) {
            detectedFlagBits.add("VK_RESOLVE_MODE_NONE");
        }
        if ((flags & SAMPLE_ZERO) != 0) {
            detectedFlagBits.add("VK_RESOLVE_MODE_SAMPLE_ZERO_BIT");
        }
        
        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }
    
    /// Constructing this class is nonsense so the constructor is made private.
    private ResolveModeFlags() {}
}
