package club.doki7.openxr.bitmask;

import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPassthroughFlagsFB.html"><code>XrPassthroughFlagsFB</code></a>
public final class XrPassthroughFlagsFB {
    public static final long IS_RUNNING_AT_CREATION = 0x1L;
    public static final long LAYER_DEPTH = 0x2L;

    public static String explain(@Bitmask(XrPassthroughFlagsFB.class) long flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & IS_RUNNING_AT_CREATION) != 0) {
            detectedFlagBits.add("XR_PASSTHROUGH_IS_RUNNING_AT_CREATION_BIT_FB");
        }
        if ((flags & LAYER_DEPTH) != 0) {
            detectedFlagBits.add("XR_PASSTHROUGH_LAYER_DEPTH_BIT_FB");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Long.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrPassthroughFlagsFB() {}
}
