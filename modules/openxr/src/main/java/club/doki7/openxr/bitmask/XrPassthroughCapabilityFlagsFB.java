package club.doki7.openxr.bitmask;

import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPassthroughCapabilityFlagsFB.html"><code>XrPassthroughCapabilityFlagsFB</code></a>
public final class XrPassthroughCapabilityFlagsFB {
    public static final long BIT = 0x1L;
    public static final long COLOR = 0x2L;
    public static final long LAYER_DEPTH = 0x4L;

    public static String explain(@Bitmask(XrPassthroughCapabilityFlagsFB.class) long flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & BIT) != 0) {
            detectedFlagBits.add("XR_PASSTHROUGH_CAPABILITY_BIT_FB");
        }
        if ((flags & COLOR) != 0) {
            detectedFlagBits.add("XR_PASSTHROUGH_CAPABILITY_COLOR_BIT_FB");
        }
        if ((flags & LAYER_DEPTH) != 0) {
            detectedFlagBits.add("XR_PASSTHROUGH_CAPABILITY_LAYER_DEPTH_BIT_FB");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Long.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrPassthroughCapabilityFlagsFB() {}
}
