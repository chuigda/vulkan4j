package club.doki7.openxr.bitmask;

import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrDebugUtilsMessageTypeFlagsEXT.html"><code>XrDebugUtilsMessageTypeFlagsEXT</code></a>
public final class XrDebugUtilsMessageTypeFlagsEXT {
    public static final long CONFORMANCE = 0x8L;
    public static final long GENERAL = 0x1L;
    public static final long PERFORMANCE = 0x4L;
    public static final long VALIDATION = 0x2L;

    public static String explain(@Bitmask(XrDebugUtilsMessageTypeFlagsEXT.class) long flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & CONFORMANCE) != 0) {
            detectedFlagBits.add("XR_DEBUG_UTILS_MESSAGE_TYPE_CONFORMANCE_BIT_EXT");
        }
        if ((flags & GENERAL) != 0) {
            detectedFlagBits.add("XR_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT");
        }
        if ((flags & PERFORMANCE) != 0) {
            detectedFlagBits.add("XR_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT");
        }
        if ((flags & VALIDATION) != 0) {
            detectedFlagBits.add("XR_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Long.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrDebugUtilsMessageTypeFlagsEXT() {}
}
