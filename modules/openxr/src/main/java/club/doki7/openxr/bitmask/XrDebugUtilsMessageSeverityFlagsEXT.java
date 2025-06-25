package club.doki7.openxr.bitmask;

import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrDebugUtilsMessageSeverityFlagsEXT.html"><code>XrDebugUtilsMessageSeverityFlagsEXT</code></a>
public final class XrDebugUtilsMessageSeverityFlagsEXT {
    public static final long ERROR = 0x1000L;
    public static final long INFO = 0x10L;
    public static final long VERBOSE = 0x1L;
    public static final long WARNING = 0x100L;

    public static String explain(@Bitmask(XrDebugUtilsMessageSeverityFlagsEXT.class) long flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & ERROR) != 0) {
            detectedFlagBits.add("XR_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT");
        }
        if ((flags & INFO) != 0) {
            detectedFlagBits.add("XR_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT");
        }
        if ((flags & VERBOSE) != 0) {
            detectedFlagBits.add("XR_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT");
        }
        if ((flags & WARNING) != 0) {
            detectedFlagBits.add("XR_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Long.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrDebugUtilsMessageSeverityFlagsEXT() {}
}
