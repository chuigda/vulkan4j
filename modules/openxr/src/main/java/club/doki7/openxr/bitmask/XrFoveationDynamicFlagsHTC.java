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
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_FOVEATION_DYNAMIC_CLEAR_FOV_ENABLED_BIT_HTC.html"><code>XR_FOVEATION_DYNAMIC_CLEAR_FOV_ENABLED_BIT_HTC</code></a>
    public static final int CLEAR_FOV_ENABLED = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_FOVEATION_DYNAMIC_FOCAL_CENTER_OFFSET_ENABLED_BIT_HTC.html"><code>XR_FOVEATION_DYNAMIC_FOCAL_CENTER_OFFSET_ENABLED_BIT_HTC</code></a>
    public static final int FOCAL_CENTER_OFFSET_ENABLED = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_FOVEATION_DYNAMIC_LEVEL_ENABLED_BIT_HTC.html"><code>XR_FOVEATION_DYNAMIC_LEVEL_ENABLED_BIT_HTC</code></a>
    public static final int LEVEL_ENABLED = 0x0;

    public static String explain(@Bitmask(XrFoveationDynamicFlagsHTC.class) int flags) {
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
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrFoveationDynamicFlagsHTC() {}
}
