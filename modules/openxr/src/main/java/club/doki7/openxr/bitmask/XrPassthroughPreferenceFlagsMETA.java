package club.doki7.openxr.bitmask;

import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPassthroughPreferenceFlagsMETA.html"><code>XrPassthroughPreferenceFlagsMETA</code></a>
public final class XrPassthroughPreferenceFlagsMETA {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_PASSTHROUGH_PREFERENCE_DEFAULT_TO_ACTIVE_BIT_META.html"><code>XR_PASSTHROUGH_PREFERENCE_DEFAULT_TO_ACTIVE_BIT_META</code></a>
    public static final long DEFAULT_TO_ACTIVE = 0x1L;

    public static String explain(@Bitmask(XrPassthroughPreferenceFlagsMETA.class) long flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & DEFAULT_TO_ACTIVE) != 0) {
            detectedFlagBits.add("XR_PASSTHROUGH_PREFERENCE_DEFAULT_TO_ACTIVE_BIT_META");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Long.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrPassthroughPreferenceFlagsMETA() {}
}
