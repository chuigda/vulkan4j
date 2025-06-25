package club.doki7.openxr.bitmask;

import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFoveationDynamicFlagsHTC.html"><code>XrFoveationDynamicFlagsHTC</code></a>
public final class XrFoveationDynamicFlagsHTC {
    public static final long CLEAR_FOV_ENABLED = 0x2L;
    public static final long FOCAL_CENTER_OFFSET_ENABLED = 0x4L;
    public static final long LEVEL_ENABLED = 0x1L;

    public static String explain(@Bitmask(XrFoveationDynamicFlagsHTC.class) long flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & CLEAR_FOV_ENABLED) != 0) {
            detectedFlagBits.add("XR_FOVEATION_DYNAMIC_CLEAR_FOV_ENABLED_BIT_HTC");
        }
        if ((flags & FOCAL_CENTER_OFFSET_ENABLED) != 0) {
            detectedFlagBits.add("XR_FOVEATION_DYNAMIC_FOCAL_CENTER_OFFSET_ENABLED_BIT_HTC");
        }
        if ((flags & LEVEL_ENABLED) != 0) {
            detectedFlagBits.add("XR_FOVEATION_DYNAMIC_LEVEL_ENABLED_BIT_HTC");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Long.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrFoveationDynamicFlagsHTC() {}
}
