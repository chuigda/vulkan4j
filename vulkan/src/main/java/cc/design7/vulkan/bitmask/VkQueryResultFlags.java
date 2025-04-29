package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkQueryResultFlags.html">VkQueryResultFlags</a>
public final class VkQueryResultFlags {
    public static final int QUERY_RESULT_64 = 0x1;
    public static final int QUERY_RESULT_PARTIAL = 0x8;
    public static final int QUERY_RESULT_WAIT = 0x2;
    public static final int QUERY_RESULT_WITH_AVAILABILITY = 0x4;
    public static final int QUERY_RESULT_WITH_STATUS_KHR = 0x10;

    public static String explain(@enumtype(VkQueryResultFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & QUERY_RESULT_64) != 0) {
            detectedFlagBits.add("VK_QUERY_RESULT_64_BIT");
        }
        if ((flags & QUERY_RESULT_PARTIAL) != 0) {
            detectedFlagBits.add("VK_QUERY_RESULT_PARTIAL_BIT");
        }
        if ((flags & QUERY_RESULT_WAIT) != 0) {
            detectedFlagBits.add("VK_QUERY_RESULT_WAIT_BIT");
        }
        if ((flags & QUERY_RESULT_WITH_AVAILABILITY) != 0) {
            detectedFlagBits.add("VK_QUERY_RESULT_WITH_AVAILABILITY_BIT");
        }
        if ((flags & QUERY_RESULT_WITH_STATUS_KHR) != 0) {
            detectedFlagBits.add("VK_QUERY_RESULT_WITH_STATUS_BIT_KHR");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkQueryResultFlags() {}
}
