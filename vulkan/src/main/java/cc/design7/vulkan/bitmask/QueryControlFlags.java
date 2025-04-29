package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkQueryControlFlags.html">VkQueryControlFlags</a>
public final class QueryControlFlags {
    public static final int PRECISE = 0x1;

    public static String explain(@enumtype(QueryControlFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & PRECISE) != 0) {
            detectedFlagBits.add("VK_QUERY_CONTROL_PRECISE_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private QueryControlFlags() {}
}
