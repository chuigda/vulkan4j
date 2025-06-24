package club.doki7.openxr.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrDebugUtilsMessageSeverityFlagsEXT.html"><code>XrDebugUtilsMessageSeverityFlagsEXT</code></a>
public final class XrDebugUtilsMessageSeverityFlagsEXT {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT.html"><code>XR_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT</code></a>
    public static final int ERROR = 0xc;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT.html"><code>XR_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT</code></a>
    public static final int INFO = 0x4;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT.html"><code>XR_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT</code></a>
    public static final int VERBOSE = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT.html"><code>XR_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT</code></a>
    public static final int WARNING = 0x8;

    public static String explain(@Bitmask(XrDebugUtilsMessageSeverityFlagsEXT.class) int flags) {
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
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrDebugUtilsMessageSeverityFlagsEXT() {}
}
