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
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_DEBUG_UTILS_MESSAGE_TYPE_CONFORMANCE_BIT_EXT.html"><code>XR_DEBUG_UTILS_MESSAGE_TYPE_CONFORMANCE_BIT_EXT</code></a>
    public static final int CONFORMANCE = 0x3;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT.html"><code>XR_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT</code></a>
    public static final int GENERAL = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT.html"><code>XR_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT</code></a>
    public static final int PERFORMANCE = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT.html"><code>XR_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT</code></a>
    public static final int VALIDATION = 0x1;

    public static String explain(@Bitmask(XrDebugUtilsMessageTypeFlagsEXT.class) int flags) {
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
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrDebugUtilsMessageTypeFlagsEXT() {}
}
