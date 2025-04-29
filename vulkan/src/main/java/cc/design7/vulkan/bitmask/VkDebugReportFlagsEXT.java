package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDebugReportFlagsEXT.html">VkDebugReportFlagsEXT</a>
public final class VkDebugReportFlagsEXT {
    public static final int DEBUG_REPORT_DEBUG = 0x10;
    public static final int DEBUG_REPORT_ERROR = 0x8;
    public static final int DEBUG_REPORT_INFORMATION = 0x1;
    public static final int DEBUG_REPORT_PERFORMANCE_WARNING = 0x4;
    public static final int DEBUG_REPORT_WARNING = 0x2;

    public static String explain(@enumtype(VkDebugReportFlagsEXT.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & DEBUG_REPORT_DEBUG) != 0) {
            detectedFlagBits.add("VK_DEBUG_REPORT_DEBUG_BIT_EXT");
        }
        if ((flags & DEBUG_REPORT_ERROR) != 0) {
            detectedFlagBits.add("VK_DEBUG_REPORT_ERROR_BIT_EXT");
        }
        if ((flags & DEBUG_REPORT_INFORMATION) != 0) {
            detectedFlagBits.add("VK_DEBUG_REPORT_INFORMATION_BIT_EXT");
        }
        if ((flags & DEBUG_REPORT_PERFORMANCE_WARNING) != 0) {
            detectedFlagBits.add("VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT");
        }
        if ((flags & DEBUG_REPORT_WARNING) != 0) {
            detectedFlagBits.add("VK_DEBUG_REPORT_WARNING_BIT_EXT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkDebugReportFlagsEXT() {}
}
