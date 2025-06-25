package club.doki7.openxr.bitmask;

import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFoveationEyeTrackedStateFlagsMETA.html"><code>XrFoveationEyeTrackedStateFlagsMETA</code></a>
public final class XrFoveationEyeTrackedStateFlagsMETA {
    public static final long VALID = 0x1L;

    public static String explain(@Bitmask(XrFoveationEyeTrackedStateFlagsMETA.class) long flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & VALID) != 0) {
            detectedFlagBits.add("XR_FOVEATION_EYE_TRACKED_STATE_VALID_BIT_META");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Long.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrFoveationEyeTrackedStateFlagsMETA() {}
}
